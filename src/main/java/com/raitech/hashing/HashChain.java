package com.raitech.hashing;

class HashChain {
    SortedList[] arr;
    int arrSize;

    HashChain(int size) {
        arrSize = size;
        arr = new SortedList[arrSize];
        for (var i = 0; i < arrSize; i++) {
            arr[i] = new SortedList();
        }
    }

    void displayTable() {
        for (var i = 0; i < arrSize; i++) {
            System.out.printf("%d. ", i);
            arr[i].displayList();
        }
    }

    int hashFunc(int key) {
        return key % arrSize;
    }

    void insert(Link link) {
        var key = link.getKey();
        var hashVal = hashFunc(key);
        arr[hashVal].insert(link);
    }

    void delete(int key) {
        var hashVal = hashFunc(key);
        arr[hashVal].delete(key);
    }

    Link find(int key) {
        var hashVal = hashFunc(key);
        var link = arr[hashVal].find(key);
        return link;
    }
}
