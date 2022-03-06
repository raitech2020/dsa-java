package com.raitech.linkedlist;

class LinkedStack {
    LinkedList list;

    LinkedStack() {
        list = new LinkedList();
    }

    void push(int iData, double dData) {
        list.insertFirst(iData, dData);
    }

    Link pop() {
        return list.deleteFirst();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        list.displayList();
    }
}
