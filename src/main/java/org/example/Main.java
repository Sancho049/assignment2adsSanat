package org.example;

import org.example.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();

        // Adding elements
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        // Accessing elements
        System.out.println("Element at index 0: " + myList.get(0)); // Should print 1
        System.out.println("Element at index 2: " + myList.get(2)); // Should print 3

        // Removing an element
        myList.remove(1); // Remove the element at index 1

        // Printing all elements
        System.out.println("Elements after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }
    }
}
