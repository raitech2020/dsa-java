package com.raitech.priorityqueue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        var queue = new PriorityQueue(20);
        queue.print();

        queue.insert(10);
        queue.insert(5);
        queue.insert(3);
        queue.insert(14);
        queue.insert(50);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(18);
        queue.insert(7);
        queue.insert(90);
        queue.insert(2);
        System.out.println(queue.toString());
        queue.print();
    }
}
