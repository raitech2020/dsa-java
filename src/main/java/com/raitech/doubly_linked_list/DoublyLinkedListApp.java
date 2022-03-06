package com.raitech.doubly_linked_list;

class DoublyLinkedListApp {
    public static void main(String[] args) {
        var list = new DoublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.displayForward();
        list.displayBackward();
    }
}
