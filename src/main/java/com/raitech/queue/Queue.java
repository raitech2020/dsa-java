package com.raitech.queue;

public class Queue {
    int maxSize;
    long[] queueArray;
    int nItems;
    int front;
    int rear;

    Queue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    void insert(long item) {
        // reset, if at end of queue
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        if (!isFull()) {
            nItems++;
        }
    }

    long remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }

        long item = queueArray[front++];
        // if front get pass the queue length, reset
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return item;
    }

    long peek() {
        long item = queueArray[front];
        return item;
    }

    boolean isFull() {
        return nItems == maxSize;
    }

    boolean isEmpty() {
        return nItems == 0;
    }

    int size() {
        return nItems;
    }

    void print() {
        for (var item : queueArray) {
            System.out.print(String.format("%d ", item));
        }
        System.out.println();
    }

    public String toString() {
        var str = String.format(
                "maxSize: %d, nItems: %d, front: %d, rear: %d",
                maxSize, nItems, front, rear
        );
        return str;
    }
}
