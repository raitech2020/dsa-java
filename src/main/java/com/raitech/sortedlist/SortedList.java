package com.raitech.sortedlist;

class SortedList {
    Link first;

    SortedList() {
        first = null;
    }

    boolean isEmpty() {
        return (first == null);
    }

    void insert(long key) {
        var newLink = new Link(key);
        Link previous = null;
        var current = first;

        while (current != null && current.data < key) {
            previous = current;
            current = current.next;
        }
        // current is now larger than key, so found the spot to place key
        if (previous == null) { // if newLinks needs to be at the front
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    Link remove() {
        var temp = first;
        first = first.next;
        return temp;
    }

    void displayList() {
        System.out.println("List (first-->last): ");
        var current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
