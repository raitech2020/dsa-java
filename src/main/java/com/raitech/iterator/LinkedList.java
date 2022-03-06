package com.raitech.iterator;

class LinkedList {
    Link first;

    LinkedList() {
        first = null;
    }

    boolean isEmpty() {
        return (first == null);
    }

    Link getFirst() {
        return first;
    }

    void setFirst(Link link) {
        first = link;
    }

    ListIterator getIterator() {
        return new ListIterator(this);
    }

    void displayList() {
        var current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
