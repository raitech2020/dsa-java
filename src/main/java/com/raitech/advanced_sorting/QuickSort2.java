package com.raitech.advanced_sorting;

import java.util.Random;

class QuickSort2 {
    public static void main(String[] args) {
        var rand = new Random();
        var numbers = new int[10];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);
        quicksort(numbers, 0, numbers.length - 1);
    }

    static void quicksort(int[] array, int lowIndex, int highIndex) {
        var pivot = array[highIndex];
        var leftPtr = lowIndex;
        var rightPtr = highIndex;

        while (leftPtr < rightPtr) {
            while (array[leftPtr] <= pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (array[rightPtr] >= pivot && leftPtr < rightPtr) {
                rightPtr--;
            }
            swap(array, leftPtr, rightPtr);
        }
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
}
