package com.raitech.sorting;

class BubbleSortApp {
    public static void main(String[] args) {
        var maxSize = 100;
        var arr = new BubbleSort(maxSize);

        arr.insert(99);
        arr.insert(77);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        System.out.println(String.format("size: %d", arr.size()));

        arr.sort();
        arr.display();
    }
}
