package com.raitech.linkedlist;

public class LinkedList {
    Link first;

    LinkedList() {
        first = null;
    }

    boolean isEmpty() {
        return (first == null);
    }

    void insertFirst(int iData, double dData) {
        var newLink = new Link(iData, dData);
        // newLink next points to old first
        // newLink -> old first
        newLink.next = first;
        // newLink become the first
        // first -> newLink
        first = newLink;
    }

    Link deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        var tempLink = first;
        first = first.next;
        return tempLink;
    }

    Link find(int key) {
        var current = first;
        while (current != null && current.iData != key) {
            current = current.next;
        }
        return current;
    }

    Link delete(int key) {
        var current = first;
        var previous = first;

        while (current != null && current.iData != key) {
            previous = current;
            current = current.next;
        }

        // This will handle empty list case also
        // key not found, hence can't delete
        if (current == null) {
            return null;
        }
        // found key, adjust links
        if (current == first) { // if to be deleted node is the first one
            first = current.next; // will be null
        } else {
            previous.next = current.next;
        }
        // deleted link
        return current;
    }

    void displayList() {
        System.out.println("List (first -> last)");
        if (isEmpty()) {
            System.out.println("--------");
            return;
        }
        var current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
        System.out.println("--------");
    }
}
