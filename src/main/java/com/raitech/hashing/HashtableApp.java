package com.raitech.hashing;

class HashtableApp {
    public static void main(String[] args) {
        int size = 100;
        var ht = new Hashtable(size);
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
        ht.display();
        item = ht.find(15);
        if (item != null) {
            System.out.printf("Found item with key %d\n", item.getKey());
        } else {
            System.out.printf("Item not found\n");
        }
        item = ht.delete(65);
        if (item != null) {
            System.out.printf("Deleted item with key %d\n", item.getKey());
        } else {
            System.out.printf("Item could not deleted since it is not found\n");
        }
        ht.display();
    }
}
