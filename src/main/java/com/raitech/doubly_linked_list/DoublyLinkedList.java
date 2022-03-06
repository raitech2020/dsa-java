package com.raitech.doubly_linked_list;

class DoublyLinkedList {
    Link first;
    Link last;

    void insertFirst(long data) {
        var newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    boolean isEmpty() {
        return (first == null);
    }

    void displayForward() {
        System.out.print("List (first-->last): ");
        var current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    void displayBackward() {
        System.out.print("List (last-->first): ");
        var current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
