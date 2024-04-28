package Classes;
import org.example.MyLinkedList;

import java.util.Iterator;

public class MyStack<T extends Comparable<T>> implements Iterable<T> {
    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.Size() == 0;
    }

    public int size() {
        return list.Size();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}