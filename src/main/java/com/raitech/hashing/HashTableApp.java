package com.raitech.hashing;

class HashTableApp {
    public static void main(String[] args) {
        int size = 100;
        var ht = new HashTable(size);
        DataItem item;
        int key;
        for (int i = 0; i < 10; i++) {
            key = (int) (Math.random() * 100);
            System.out.printf("%d ", key);
            ht.insert(new DataItem(key));
        }
        System.out.printf("%n");
        ht.insert(new DataItem(25));
        ht.insert(new DataItem(45));
        ht.insert(new DataItem(35));
        ht.insert(new DataItem(55));
        ht.insert(new DataItem(15));
        ht.insert(new DataItem(1));
        ht.insert(new DataItem(2));
        ht.display();
        key = 15;
        item = ht.find(key);
        if (item != null) {
            System.out.printf("Found item with key %d\n", key);
        } else {
            System.out.printf("Item with key %d not found\n", key);
        }
        key = 65;
        item = ht.delete(key);
        if (item != null) {
            System.out.printf("Deleted item with key %d\n", key);
        } else {
            System.out.printf("Item with key %d could not deleted since it is not found\n", key);
        }
        ht.delete(1);
        ht.delete(2);
        ht.display();
    }
}
