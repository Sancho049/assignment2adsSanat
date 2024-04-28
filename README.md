ASSIGNMENT 2 -- DOCUMENTATION

MyList

MyList - is an interface that defines basic operations such as adding, deleting, and retrieving elements.

Methods:

add(T item): Adds an element to the end of the list.
set(int index, T item): Sets the element at the specified index.
add(int index, T item): Adds an element at the specified index.
addFirst(T item): Adds an element to the beginning of the list.
addLast(T item): Adds an element to the end of the list.
get(int index): Returns the element at the specified index.
getFirst(): Returns the first element of the list.
getLast(): Returns the last element of the list.
remove(int index): Removes the element at the specified index.
removeFirst(): Removes the first element of the list.
removeLast(): Removes the last element of the list.
sort(): Sorts the list.
indexOf(): Returns the index of the first occurrence of the specified element.
lastIndexOf(Object object): Returns the index of the last occurrence of the specified element.
exists(Object object): Checks whether an element exists in the list.
toArray(): Returns an array of all elements of the list.
clear(): Clears the list.
size(): Returns the number of elements in the list.

MyArrayList:
MyArrayList - is an implementation of the MyList interface that uses an array to store elements.

MyLinkedList:
MyLinkedList - is an implementation of the MyList interface that uses a doubly linked list to store elements.

MyStack:
MyStack - is a class that implements a stack data structure, using MyLinkedList to store elements.

MyQueue:
MyQueue - is a class that implements a queue data structure, using MyLinkedList to store elements.

MyMinHeap:
MyMinHeap - is a class that implements a min-heap data structure, using MyArrayList to store elements.

Main:
Main - is a class containing a main method that can be used to test implementations of the above collections.
