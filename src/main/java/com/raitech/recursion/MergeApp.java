package com.raitech.recursion;

class MergeApp {
    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC);
    }

    static void merge(
            int[] arrayA, int sizeA,
            int[] arrayB, int sizeB,
            int[] arrayC
    ) {
        int indexA = 0, indexB = 0, indexC = 0;

        while (indexA < sizeA && indexB < sizeB) {
            if (arrayA[indexA] < arrayB[indexB]) {
                arrayC[indexC++] = arrayA[indexA++];
            } else {
                arrayC[indexC++] = arrayB[indexB++];
            }
        }
        while (indexA < sizeA) {
            arrayC[indexC++] = arrayA[indexA++];
        }
        while (indexB < sizeB) {
            arrayC[indexC++] = arrayB[indexB++];
        }
    }

    static void display(int[] arr) {
        for (var num : arr) {
            System.out.print(String.format("%d ", num));
        }
        System.out.println();
    }

    // merge without size
    static void merge(
            int[] arrayA,
            int[] arrayB,
            int[] arrayC
    ) {
        int sizeA = arrayA.length;
        int sizeB = arrayB.length;
        int indexA = 0, indexB = 0, indexC = 0;

        while (indexA < sizeA && indexB < sizeB) {
            if (arrayA[indexA] < arrayB[indexB]) {
                arrayC[indexC++] = arrayA[indexA++];
            } else {
                arrayC[indexC++] = arrayB[indexB++];
            }
        }
        while (indexA < sizeA) {
            arrayC[indexC++] = arrayA[indexA++];
        }
        while (indexB < sizeB) {
            arrayC[indexC++] = arrayB[indexB++];
        }
    }

    // display with size
    static void display(int[] arr, int size) {
        for (var i = 0; i < size; i++) {
            System.out.print(String.format("%d ", arr[i]));
        }
        System.out.println();
    }
}
