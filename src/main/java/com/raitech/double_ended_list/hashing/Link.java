package com.raitech.double_ended_list.hashing;

class Link {
    int data;
    Link next;

    Link(int data) {
        this.data = data;
    }

    int getKey() {
        return data;
    }

    void displayLink() {
        System.out.printf("%d ", data);
    }

    public String toString() {
        return String.format("%d", data);
    }
}
