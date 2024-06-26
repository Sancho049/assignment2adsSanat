package org.example;

public class MyQueue<T extends Comparable<T>> implements Iterable<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {

        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.Size() == 0;
    }

    public int size() {
        return list.Size();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }
}