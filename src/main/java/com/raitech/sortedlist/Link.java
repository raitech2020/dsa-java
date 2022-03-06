package com.raitech.sortedlist;

class Link {
    long data;
    Link next;

    Link(long data) {
        this.data = data;
    }

    void displayLink() {
        System.out.print(String.format("%d ", data));
    }
}
