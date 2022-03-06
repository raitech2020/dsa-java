package com.raitech.recursion;

class Anagram {
    int size;
    int count;
    char[] arr = new char[100];

    Anagram(String word) {
        count = 0;
        size = word.length();
        for (var i = 0; i < size; i++) {
            arr[i] = word.charAt(i);
        }
        doAnagram(size);
    }

    void doAnagram(int newSize) {
        // base case
        if (newSize == 1) {
            return;
        }
        for (var j = 0; j < newSize; j++) {
            doAnagram(newSize - 1);
            if (newSize == 2) {
                displayWord();
            }
            rotate(newSize);
        }
    }

    void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char tmp = arr[position];
        for (j = position + 1; j < size; j++) {
            arr[j - 1] = arr[j];
        }
        arr[j - 1] = tmp;
    }

    void displayWord() {
        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (var j = 0; j < size; j++) {
            System.out.print(arr[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if (count % 6 == 0) {
            System.out.print("");
        }
    }
}