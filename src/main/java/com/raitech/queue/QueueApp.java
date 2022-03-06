package com.raitech.queue;

public class QueueApp {
    public static void main(String[] args) {
        var queue = new Queue(5);
        System.out.println(queue.toString());

        var item = queue.remove();
        System.out.println(String.format("item = %d", item));

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(6);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(7);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(8);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(9);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(10);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(11);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(12);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(13);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(14);
        System.out.println(queue.toString());
        queue.print();

        queue.insert(15);
        System.out.println(queue.toString());
        queue.print();
    }
}
