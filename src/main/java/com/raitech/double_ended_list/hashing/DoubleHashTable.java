package com.raitech.double_ended_list.hashing;

class DoubleHashTable {
    DataItem[] arr;
    int arrSize;
    DataItem nonItem;

    DoubleHashTable(int size) {
        arrSize = size;
        arr = new DataItem[arrSize];
        nonItem = new DataItem(-1);
    }

    void display() {
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] != null) {
                System.out.printf("%d ", arr[i].getKey());
            } else {
                System.out.printf("** ");
            }
        }
        System.out.println();
    }

    int hashFunc1(int key) {
        return key % arrSize;
    }

    int hashFunc2(int key) {
        return 5 - key % 5;
    }

    void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc1(key);
        int stepSize = hashFunc2(key);
        // Loop while "not an empty cell" and "not a deleted cell"
        while (arr[hashVal] != null && arr[hashVal].getKey() != -1) {
            hashVal += stepSize;
            hashVal %= arrSize; // if hashVal overflowed
        }
        arr[hashVal] = item;
    }

    DataItem find(int key) {
        int hashVal = hashFunc1(key);
        int hashStep = hashFunc2(key);
        System.out.printf("hashVal: %d, hashStep: %d\n", hashVal, hashStep);
        while (arr[hashVal] != null) {
            if (arr[hashVal].getKey() == key) {
                System.out.println();
                return arr[hashVal];
            }
            hashVal += hashStep;
            hashVal %= arrSize;
            System.out.printf("%d ", hashVal);
        }
        return null;
    }

    DataItem delete(int key) {
        int hashVal = hashFunc1(key);
        int hashStep = hashFunc2(key);
        while (arr[hashVal] != null) {
            if (arr[hashVal].getKey() == key) {
                var temp = arr[hashVal];
                arr[hashVal] = nonItem;
                return temp;
            }
            hashVal += hashStep;
            hashVal %= arrSize;
        }
        return null;
    }
}
