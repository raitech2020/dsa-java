package com.raitech.double_ended_list;

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
