package com.raitech.heap;

class Heap {
    Node[] heapArray;
    int maxSize;
    int currentSize;

    Heap(int max) {
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean insert(int key) {
        if (currentSize == maxSize) { // array is full
            return false;
        }
        var newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);
        currentSize++;
        return true;
    }

    void trickleUp(int index) {
        Node tempNode = heapArray[index];
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heapArray[parentIndex].key < tempNode.key) {
            heapArray[index] = heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
        heapArray[index] = tempNode;
    }

    Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    void trickleDown(int index) {

    }
}


