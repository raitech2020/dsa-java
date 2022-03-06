package com.raitech.sorting;

class InsertionSortApp {
    public static void main(String[] args) {
        var maxSize = 100;
        var arr = new InsertionSort(maxSize);

        arr.insert(99);
        arr.insert(77);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(5);
        arr.insert(15);
        arr.insert(60);
        arr.insert(19);
        arr.display();
        System.out.println(String.format("size: %d", arr.size()));

        arr.sort();
        arr.display();
        System.out.println(String.format("size: %d", arr.size()));
    }
}
