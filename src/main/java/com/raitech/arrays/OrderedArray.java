package com.raitech.arrays;

class OrderedArray {
    int[] a;
    int numElems;

    OrderedArray(int maxSize) {
        a = new int[maxSize];
        numElems = 0;
    }

    int size() {
        return numElems;
    }

    void insert(int data) {
        int i;
        // find where to place the data
        for (i = 0; i < numElems; i++) {
            if (a[i] > data) {
                break;
            }
        }
        // move elements to find place for data
        for (int j = numElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        // place data and increment numElems
        a[i] = data;
        numElems++;
    }

    boolean delete(int data) {
        int index = find(data);
        if (index == -1) {
            System.out.println(String.format("Couldn't delete %d since it is not in array"));
            return false;
        }
        for (int j = index; j < numElems; j++) {
            a[j] = a[j + 1];
        }
        numElems--;
        return true;
    }

    int find(int key) {
        int lowerBound = 0;
        int upperBound = numElems - 1;
        int curIndex;

        while (true) {
            curIndex = (lowerBound + upperBound) / 2;
            if (a[curIndex] == key) {
                return curIndex;
            }
            if (lowerBound > upperBound) {
                return -1; // can't find item
            }
            if (a[curIndex] < key) {
                lowerBound = curIndex + 1;
            } else {
                upperBound = curIndex - 1;
            }
        }
    }

    void display() {
        for (int i = 0; i < numElems; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
    }
}
