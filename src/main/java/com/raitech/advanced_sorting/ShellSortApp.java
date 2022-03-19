package com.raitech.advanced_sorting;

class ShellSortApp {
    public static void main(String[] args) {
        int max = 100;
        var arr = new ShellSort(max);
        int num;
        for (int i = 0; i < max; i++) {
            num = (int) (Math.random() * 99);
            arr.insert(num);
        }
        arr.display();
        arr.sort();
        arr.display();
    }
}
