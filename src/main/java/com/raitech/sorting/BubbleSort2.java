package com.raitech.sorting;

import java.util.Random;

class BubbleSort2 {
    public static void main(String[] args) {
        var rand = new Random();
        var numbers = new int[10];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    private static void bubbleSort(int[] inputArray) {
        for (int i = inputArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    swap(inputArray, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void printArray(int[] array) {
        for (var num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
