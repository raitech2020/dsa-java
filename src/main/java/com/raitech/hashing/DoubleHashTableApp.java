package com.raitech.hashing;

class DoubleHashTableApp {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        int size = 23;
        DataItem item;
        int key;
        var ht = new DoubleHashTable(size);
        int[] nums = {
                1, 38, 37, 16,
                20, 3, 11, 24,
                5, 16, 10, 31,
                18, 12, 30, 1,
                19, 36, 41, 15,
                25
        };
        for (var num : nums) {
            ht.insert(new DataItem(num));
        }
        ht.display();
        key = 25;
        item = ht.find(key);
        if (item != null) {
            System.out.printf("Found item with key %d\n", key);
        } else {
            System.out.printf("Item with key %d not found\n", key);
        }
    }

    static void test2() {
        int size = 100;
        var ht = new DoubleHashTable(size);
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
