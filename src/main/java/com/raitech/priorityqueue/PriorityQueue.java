package com.raitech.priorityqueue;

public class PriorityQueue {
    long[] queueArray;
    int maxSize;
    int nItems;

    PriorityQueue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        nItems = 0;
    }

    void insert(long item) {
        if (nItems == 0) { // empty queue
            queueArray[nItems++] = item;
            return;
        }

        int j;

        for (j = nItems - 1; j >= 0; j--) {
            if (item > queueArray[j]) {
                // shift upward
                queueArray[j + 1] = queueArray[j];
            } else {
                // done shifting
                // j + 1 is the right place to put the item
                break;
            }
        }

        queueArray[j + 1] = item;
        nItems++;
    }

    long remove() {
        // modify nItems also
        var item = queueArray[--nItems];
        return item;
    }

    long peak() {
        // do not modify nItems
        var item = queueArray[nItems - 1];
        return item;
    }

    boolean isEmpty() {
        return (nItems == 0);
    }

    boolean isFull() {
        return (nItems == maxSize);
    }

    void print() {
        for (var item : queueArray) {
            System.out.print(String.format("%d ", item));
        }
        System.out.println();
    }

    public String toString() {
        var str = String.format(
                "maxSize: %d, nItems: %d",
                maxSize, nItems
        );
        return str;
    }
}
