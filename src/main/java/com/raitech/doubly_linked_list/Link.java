package com.raitech.doubly_linked_list;

class Link {
    long data;
    Link next;
    Link previous;

    Link(long data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    void displayLink() {
        System.out.print(String.format("%d ", data));
    }
}
