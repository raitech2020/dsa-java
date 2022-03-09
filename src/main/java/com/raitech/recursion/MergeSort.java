package com.raitech.recursion;

class MergeSort {
    int[] arr;
    int nElems;
    int[] workspace;

    MergeSort(int max) {
        arr = new int[max];
        nElems = 0;
    }

    void insert(int value) {
        arr[nElems] = value;
        nElems++;
    }

    int size() {
        return nElems;
    }

    void display() {
        for (var i = 0; i < nElems; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    void display(int[] array, String arrayName) {
        System.out.println(arrayName);
        for (var num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

    void mergeSort() {
        workspace = new int[nElems];
        recMergeSort(0, nElems - 1);
    }

    void recMergeSort(int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        }
        int mid = (lowerBound + upperBound) / 2;
        recMergeSort(lowerBound, mid);
        recMergeSort(mid + 1, upperBound);
        merge(lowerBound, upperBound);
    }

    void merge(int lowerBound, int upperBound) {
        int j = 0;
        int mid = (lowerBound + upperBound) / 2;
        int lowPtr = lowerBound;
        int highPtr = mid + 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (arr[lowPtr] < arr[highPtr]) {
                workspace[j++] = arr[lowPtr++];
            } else {
                workspace[j++] = arr[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workspace[j++] = arr[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workspace[j++] = arr[highPtr++];
        }
        System.out.printf("n = %d\n", n);
        display(arr, "arr");
        display(workspace, "workspace");
        for (j = 0; j < n; j++) {
            arr[lowerBound + j] = workspace[j];
        }
    }
}
