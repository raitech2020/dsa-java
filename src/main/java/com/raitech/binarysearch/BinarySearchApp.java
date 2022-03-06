package com.raitech.binarysearch;

class BinarySearchApp {
    public static void main(String[] args) {
        int maxSize = 20;
        var arr = new BinarySearch(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(46);
        arr.display();

        int key = 99;
        if (arr.find(key) != -1) {
            System.out.println(String.format("Found %d", key));
        } else {
            System.out.println(String.format("didn't find %d", key));
        }
    }
}
