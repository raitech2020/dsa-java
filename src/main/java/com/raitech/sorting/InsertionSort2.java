package com.raitech.sorting;

import java.util.Random;

class InsertionSort2 {
    public static void main(String[] args) {
        var rand = new Random();
        var numbers = new int[10];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int tmp = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > tmp) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = tmp;
        }
    }

    private static void insertionSort2(int[] inputArray) {
        for (var i = 1; i < inputArray.length; i++) {
            var tmp = inputArray[i];
            var j = i - 1;
            while (j >= 0 && inputArray[j] > tmp) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = tmp;
        }
    }

    private static void printArray(int[] numbers) {
        for (var num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
