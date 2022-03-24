package com.raitech.heap;

import java.util.Random;

class HeapApp {
    public static void main(String[] args) {
        testHeapSort();
    }

    static void testHeapSort() {
        int size = 10;
        var heap = new Heap(size);
        Node node;
        int rand;
        // create a random array
        for (var i = 0; i < size; i++) {
            rand = (int) (Math.random() * 99);
            node = new Node(rand);
            heap.insertAt(i, node);
            heap.incrementSize();
        }
        System.out.println("Random: ");
        heap.displayArray();
        // convert random array into heap
        for (var i = size / 2 - 1; i >= 0; i--) {
            heap.trickleDown(i);
        }
        System.out.println("Heap: ");
        heap.displayHeap();
        // sort array in ascending order
        for (var i = size - 1; i >= 0; i--) {
            node = heap.remove(); // largest node
            heap.insertAt(i, node);
        }
        System.out.println("Sorted: ");
        heap.displayArray();
        heap.displayHeap();
    }

    static void testHeap() {
        int size = 31;
        var heap = new Heap(size);
        heap.insert(70);
        heap.insert(40);
        heap.insert(50);
        heap.insert(20);
        heap.insert(60);
        heap.insert(100);
        heap.insert(80);
        heap.insert(30);
        heap.insert(10);
        heap.insert(90);
        heap.displayHeap();
        heap.insert(53);
        heap.displayHeap();
        heap.remove();
        heap.displayHeap();
    }
}
