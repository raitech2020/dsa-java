package com.raitech.sortedlist;

class SortedListApp {
    public static void main(String[] args) {
        var list = new SortedList();
        list.insert(20);
        list.insert(40);
        list.displayList();
        System.out.println("1");

        list.insert(10);
        list.displayList();
        list.insert(30);
        list.displayList();
        list.insert(50);
        list.insert(5);
        list.insert(125);
        list.insert(35);
        list.insert(0);
        list.insert(9);
        list.displayList();

        var link = list.remove();
        System.out.println(String.format("deleted item: %d", link.data));
        list.displayList();
        list.remove();
        list.remove();
        list.displayList();
    }
}
