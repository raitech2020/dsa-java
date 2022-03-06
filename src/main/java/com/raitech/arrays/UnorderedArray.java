package com.raitech.arrays;

class UnorderedArray {
    long[] a;
    int numElems;

    UnorderedArray(int maxSize) {
        a = new long[maxSize];
        numElems = 0;
    }

    boolean find(long key) {
        int index;
        for (index = 0; index < numElems; index++) {
            if (a[index] == key) {
                break;
            }
        }
        if (index == numElems) {
            return false;
        } else {
            return true;
        }
    }

    void insert(long data) {
        a[numElems++] = data;
    }

    boolean delete(long data) {
        int i;
        for (i = 0; i < numElems; i++) {
            if (a[i] == data) {
                break;
            }
        }
        if (i == numElems) {
            return false;
        }
        for (int j = i; j < numElems; j++) {
            a[j] = a[j + 1];
        }
        numElems--;
        return true;
    }

    void display() {
        for (int i = 0; i < numElems; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
    }
}
