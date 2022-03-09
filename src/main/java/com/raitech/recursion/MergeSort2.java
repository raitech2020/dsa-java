package com.raitech.recursion;

import java.util.Random;

class MergeSort2 {
    public static void main(String[] args) {
        var rand = new Random();
        var numbers = new int[10];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);
        mergeSort(numbers);
        System.out.println("\nAfter");
        printArray(numbers);
    }

    static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) { // empty or one element
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    static void printArray(int[] numbers) {
        for (var num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
