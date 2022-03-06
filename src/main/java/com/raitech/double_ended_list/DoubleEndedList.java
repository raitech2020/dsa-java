package com.raitech.double_ended_list;

class DoubleEndedList {
    Link first;
    Link last;

    DoubleEndedList() {
        first = null;
        last = null;
    }

    void insertFirst(long data) {
        var newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            // no change in last
            newLink.next = first;
        }
        first = newLink;
    }

    void insertLast(long data) {
        var newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    long deleteFirst() {
        if (isEmpty()) {
            return -1;
        }
        var data = first.data;
        // if only one item
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return data;
    }

    boolean isEmpty() {
        return (first == null);
    }

    void displayList() {
        System.out.print("List (first -> last): ");
        var current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
