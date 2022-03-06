package com.raitech.linkedlist;

class Link {
    int iData;
    double dData;
    Link next;

    Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    void displayLink() {
        System.out.print(String.format("{%d, %.2f} ", iData, dData));
    }
}
