package org.example;
import java.util.Arrays;

import java.util.Iterator;

/**
 *
 * @param <T>
 */
public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     *
     * @param item
     */
    @Override
    public void add(T item) {
        ensureCapacity();
        array[size++] = item;
    }

    /**
     *
     * @param index
     * @param item
     */
    @Override
    public void set(int index, T item) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        array[index] = item;
    }

    /**
     *
     * @param index
     * @param item
     */
    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
    }

    /**
     *
     * @param item
     */
    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    /**
     *
     * @param item
     */
    @Override
    public void addLast(T item) {
        add(size, item);
    }

    /**
     *
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        return (T) array[index];
    }

    /**
     *
     * @return
     */
    @Override
    public T getFirst() {
        return (T) array[0];
    }

    /**
     *
     * @return
     */
    @Override
    public T getLast() {
        return (T) array[size - 1];
    }

    /**
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        // shifting all elements after removed element
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    /**
     *
     */
    @Override
    public void removeFirst() {
        remove(0);
    }

    /**
     *
     */
    @Override
    public void removeLast() {
        remove(size - 1);
    }

    /**
     *
     */
    @Override
    public void sort() {
        Arrays.sort(array, 0, size);
    }
    /**
     *
     * @param object
     * @return
     */
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    /**
     *
     * @return
     */
    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    /**
     *
     */
    @Override
    public void Clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int Size() {
        return size;
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            /**
             *
             * @return
             */
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException("No more elements");
                }
                return (T) array[currentIndex++];
            }
        };
    }

    /**
     *
     */
    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}