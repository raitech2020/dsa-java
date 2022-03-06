package com.raitech.sorting;

class BubbleSort {
    int[] a;
    int nElems;

    BubbleSort(int maxSize) {
        a = new int[maxSize];
        nElems = 0;
    }

    void insert(int value) {
        a[nElems++] = value;
    }

    int size() {
        return nElems;
    }

    void sort() {
        for (var i = nElems - 1; i > 0; i--) {
            for (var j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    void swap(int i, int j) {
        var tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
    }
}
