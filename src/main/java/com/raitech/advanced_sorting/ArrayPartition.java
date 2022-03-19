package com.raitech.advanced_sorting;

class ArrayPartition {
    int[] arr;
    int nElems;

    ArrayPartition(int max) {
        arr = new int[max];
        nElems = 0;
    }

    void insert(int value) {
        arr[nElems++] = value;
    }

    int size() {
        return nElems;
    }

    int partition(int left, int right, int pivot) {
//        int leftPtr = left - 1; // before 1st item
//        int rightPtr = right + 1; // after last item
        int leftPtr = left;
        int rightPtr = right;

        while (true) {
            while (arr[leftPtr] < pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (arr[rightPtr] > pivot && leftPtr < rightPtr) {
                rightPtr--;
            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }

    void swap(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
