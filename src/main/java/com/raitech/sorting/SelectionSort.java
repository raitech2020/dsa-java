package com.raitech.sorting;

class SelectionSort {
    int[] a;
    int nElems;

    SelectionSort(int maxSize) {
        System.out.println("SelectionSort");
        a = new int[maxSize];
        nElems = 0;
    }

    void insert(int value) {
        a[nElems++] = value;
    }

    void sort() {
        int i, j, min;
        for (i = 0; i < nElems - 1; i++) {
            min = i;
            for (j = i + 1; j < nElems; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    void swap(int i, int j) {
        var tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    int size() {
        return nElems;
    }

    void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
    }
}
