package com.raitech.hashing;

class Hashtable {
    DataItem[] arr;
    int arrSize;
    DataItem nonItem;

    Hashtable(int size) {
        arrSize = size;
        arr = new DataItem[arrSize];
        nonItem = new DataItem(-1);
    }

    void display() {
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] != null) {
                System.out.printf("%d ", arr[i].getKey());
            } else {
                System.out.printf("* ");
            }
        }
        System.out.println();
    }

    int hashFunc(int key) {
        return key % arrSize;
    }

    void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        // find an empty cell or a deleted cell
        while (arr[hashVal] != null && arr[hashVal].getKey() != -1) {
            ++hashVal;
            // hash the hashVal in case it overflowed due to increments
            hashVal %= arrSize; // wraparound
        }
        arr[hashVal] = item;
    }

    DataItem find(int key) {
        var hashVal = hashFunc(key); // index where key could be
        while (arr[hashVal] != null) {
            if (arr[hashVal].getKey() == key) {
                return arr[hashVal];
            }
            ++hashVal;
            hashVal %= arrSize;
        }
        return null;
    }

    DataItem delete(int key) {
        var hashVal = hashFunc(key);
        while (arr[hashVal] != null) { // not an empty cell
            if (arr[hashVal].getKey() == key) {
                var temp = arr[hashVal];
                arr[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arrSize; // hash it, if it overflows due to increments
        }
        return null;
    }

}
