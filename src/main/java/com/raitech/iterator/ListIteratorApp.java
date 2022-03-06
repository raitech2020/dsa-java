package com.raitech.iterator;

class ListIteratorApp {
    public static void main(String[] args) {
        var list = new LinkedList();
        var iter = list.getIterator();

        // insertAfterCurrent
        iter.insertAfter(60);
        iter.insertAfter(30);
        iter.insertAfter(100);
        iter.reset();
        iter.nextLink();
        iter.insertAfter(5);
        list.displayList();

        System.out.println(String.format("previous: %d", iter.getPrevious().data));
        System.out.println(String.format("current: %d", iter.getCurrent().data));
        System.out.println("------ 1 ------");

        iter.insertBefore(35);
        list.displayList();
        System.out.println(String.format("previous: %d", iter.getPrevious().data));
        System.out.println(String.format("current: %d", iter.getCurrent().data));
        System.out.println("------ 2 -----");

        iter.insertAfter(40);
        iter.insertAfter(45);
        list.displayList();
        System.out.println(String.format("previous: %d", iter.getPrevious().data));
        System.out.println(String.format("current: %d", iter.getCurrent().data));
        System.out.println("------ 3 -----");

        iter.insertBefore(42);
        iter.insertBefore(44);
        list.displayList();
        System.out.println(String.format("previous: %d", iter.getPrevious().data));
        System.out.println(String.format("current: %d", iter.getCurrent().data));
        System.out.println("------ 4 -----");

        iter.insertAfter(20);
        iter.insertAfter(50);
        iter.insertAfter(10);
        list.displayList();
        System.out.println(String.format("previous: %d", iter.getPrevious().data));
        System.out.println(String.format("current: %d", iter.getCurrent().data));
        System.out.println("------ 5 -----");
    }
}
