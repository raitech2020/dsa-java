package com.raitech.advanced_sorting;

class ShellSort {
    int[] arr;
    int nElems;

    ShellSort(int max) {
        arr = new int[max];
        nElems = 0;
    }

    void insert(int value) {
        arr[nElems++] = value;
    }

    void display() {
        System.out.print("A = ");
        for (int i = 0; i < nElems; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    void sort() {
        int inner, outer, temp;

        int h = 1; // initial value of interval h
        // Find starting point of interval h
        while (h <= nElems / 3) {
            System.out.printf("%d ", h);
            h = h * 3 + 1;
        }
        System.out.println();

        while (h > 0) {
            System.out.printf("Elems: %d, interval: %d \n", nElems, h);
            for (outer = h; outer < nElems; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
