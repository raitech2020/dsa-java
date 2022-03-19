package com.raitech.advanced_sorting;

class ArrayPartitionApp {
    public static void main(String[] args) {
        int max = 16;
        var arr = new ArrayPartition(max);
        double rand;
        for (int i = 0; i < max; i++) {
            rand = Math.random() * 199;
            arr.insert((int) rand);
        }
        arr.display();
        int pivot = 99;
        int partIndex = arr.partition(0, arr.size() - 1, pivot);
        System.out.printf("pivot: %d, partIndex: %d\n", pivot, partIndex);
        arr.display();
    }
}
