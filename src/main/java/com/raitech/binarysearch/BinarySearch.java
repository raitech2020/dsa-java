package com.raitech.binarysearch;

class BinarySearch {
    int[] a;
    int nElems;

    BinarySearch(int maxSize) {
        a = new int[maxSize];
        nElems = 0;
    }

    int size() {
        return nElems;
    }

    void insert(int data) {
        int i;
        // find where to place the data, linear search
        for (i = 0; i < nElems; i++) {
            if (a[i] > data) {
                break;
            }
        }
        // move bigger elements up to find place for data
        for (int j = nElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        // place data and increment nElems
        a[i] = data;
        nElems++;
    }

    int find(int key) {
        return find(key, 0, nElems - 1);
    }

    int find(int key, int lowerBound, int upperBound) {
        // base case
        if (lowerBound > upperBound) {
            return -1;
        }
        // base case
        var curIndex = (lowerBound + upperBound) / 2;
        if (a[curIndex] == key) {
            return curIndex;
        }
        // recursive case
        if (a[curIndex] < key) {
            return find(key, curIndex + 1, upperBound);
        } else {
            return find(key, lowerBound, curIndex - 1);
        }
    }

    void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
    }
}
