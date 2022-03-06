package com.raitech.linkedlist;

public class LinkedListApp {
    public static void main(String[] args) {
        var list = new LinkedList();
        Link link;
        int key;

        // Insert a link
        list.insertFirst(1, 1.5);
        list.displayList();

        // Delete a link
        key = 1;
        link = list.delete(key);
        if (link != null) {
            System.out.println(String.format("Deleted link with key %d and data %.2f", key, link.dData));
        } else {
            System.out.println(String.format("Link with key %d not found", key));
        }
        list.displayList();

        // Insert links
        list.insertFirst(1, 1.5);
        list.insertFirst(3, 3.5);
        list.insertFirst(2, 2.5);
        list.insertFirst(5, 5.5);
        list.insertFirst(4, 4.5);
        list.displayList();

        // Find a link
        key = 8;
        link = list.find(key);
        if (link != null) {
            System.out.println(String.format("Found link with key %d and data %.2f", key, link.dData));
        } else {
            System.out.println(String.format("Link with key %d not found", key));
        }
        System.out.println();

        // Delete a link
        key = 5;
        link = list.delete(key);
        if (link != null) {
            System.out.println(String.format("Deleted link with key %d and data %.2f", key, link.dData));
        } else {
            System.out.println(String.format("Link with key %d not found", key));
        }
        list.displayList();

        while (!list.isEmpty()) {
            System.out.print("Deleted ");
            link = list.deleteFirst();
            link.displayLink();
            System.out.println(" ");
        }
        list.displayList();
    }
}
