package com.raitech.sorting;

class InsertionSort {
    int[] a;
    int nElems;

    InsertionSort(int maxSize) {
        System.out.println("InsertionSort");
        a = new int[maxSize];
        nElems = 0;
    }

    void insert(int value) {
        a[nElems++] = value;
    }

    void sort() {
        System.out.println("certainly my sort");
        int out, in, tmp;
        for (out = 1; out < nElems; out++) {
            tmp = a[out];
            for (in = out; in > 0 && a[in - 1] > tmp; in--) {
                a[in] = a[in - 1];
            }
            a[in] = tmp;
        }
    }

    void sort1() {
        int out, in, tmp;
        for (out = 1; out < nElems; out++) {
            tmp = a[out];
            for (in = out; in > 0; in--) {
                if (a[in - 1] > tmp) {
                    a[in] = a[in - 1];
                } else {
                    break;
                }
            }
            a[in] = tmp;
        }
    }

    void sort3() {
        int in, out, tmp;
        for (out = 1; out < nElems; out++) {
            tmp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= tmp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = tmp;
        }
    }

    void sort4() {
        int in, out, tmp;

        for (out = 1; out < nElems; out++) {
            tmp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= tmp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = tmp;
        }
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
