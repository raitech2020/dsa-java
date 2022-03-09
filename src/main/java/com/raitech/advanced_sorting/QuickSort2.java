package com.raitech.advanced_sorting;

import java.util.Random;

class QuickSort2 {
    public static void main(String[] args) {
        var rand = new Random();
        var numbers = new int[10];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        var pivotIndex = (new Random().nextInt(highIndex - lowIndex)) + lowIndex;
        swap(array, pivotIndex, highIndex);

        int leftPtr = partition(array, lowIndex, highIndex);
        quicksort(array, lowIndex, leftPtr - 1);
        quicksort(array, leftPtr + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        var leftPtr = lowIndex;
        var rightPtr = highIndex;
        var pivot = array[highIndex];

        while (leftPtr < rightPtr) {
            while (array[leftPtr] <= pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (array[rightPtr] >= pivot && leftPtr < rightPtr) {
                rightPtr--;
            }
            swap(array, leftPtr, rightPtr);
        }
        swap(array, leftPtr, highIndex);
        return leftPtr;
    }

    static void swap(int[] array, int index1, int index2) {
        var tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    static void printArray(int[] numbers) {
        for (var num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

//    static void quicksort2(int[] array, int lowIndex, int highIndex) {
//        if (lowIndex >= highIndex) {
//            return;
//        }
//
//        var pivotIndex = (new Random().nextInt(highIndex - lowIndex)) + lowIndex;
//        System.out.printf("lowIndex: %d, highIndex: %d, pivotIndex: %d\n", lowIndex, highIndex, pivotIndex);
//        var pivot = array[pivotIndex];
//        swap(array, pivotIndex, highIndex);
//
//        int leftPtr = partition2(array, lowIndex, highIndex, pivot);
//        quicksort(array, lowIndex, leftPtr - 1);
//        quicksort(array, leftPtr + 1, highIndex);
//    }

//    private static int partition2(int[] array, int lowIndex, int highIndex, int pivot) {
//        var leftPtr = lowIndex;
//        var rightPtr = highIndex;
//
//        while (leftPtr < rightPtr) {
//            while (array[leftPtr] <= pivot && leftPtr < rightPtr) {
//                leftPtr++;
//            }
//            while (array[rightPtr] >= pivot && leftPtr < rightPtr) {
//                rightPtr--;
//            }
//            swap(array, leftPtr, rightPtr);
//        }
//        swap(array, leftPtr, highIndex);
//        return leftPtr;
//    }
}
