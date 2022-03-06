package com.raitech.arrays;

class UnorderedArrayApp {
    public static void main(String[] args) {
        var arr = new UnorderedArray(20);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int key = 25;
        if (arr.find(key)) {
            System.out.println(String.format("Found %d", key));
        } else {
            System.out.println(String.format("Can't find %d", key));
        }

        long[] items = {44, 0, 77, 105};
        for (var item : items) {
            if (arr.delete(item)) {
                System.out.println(String.format("deleted item %d", item));
            } else {
                System.out.println(String.format("couldn't delete item %d, since it is not in array.", item));
            }
        }
        arr.display();
    }
}
