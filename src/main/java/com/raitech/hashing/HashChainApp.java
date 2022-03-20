package com.raitech.hashing;

class HashChainApp {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        int size = 20;
        Link link;
        int key;
        var ht = new HashChain(size);
        int[] nums = {
                240, 1160,
                143,
                1004,
                1485, 1585,
                87, 1407,
                309,
                490,
                872,
                1073,
                594, 954,
                335,
                1216,
                1057, 1357,
                938, 1818
        };
        for (var num : nums) {
            ht.insert(new Link(num));
        }
        ht.displayTable();
        key = 491;
        link = ht.find(key);
        if (link != null) {
            System.out.printf("key %d found\n", link.getKey());
        } else {
            System.out.printf("key %d not found\n", key);
        }

        nums = new int[] {594, 954, 1004, 1160};
        System.out.printf("deleting ");
        for (var num : nums) {
            System.out.printf("%d ", num);
            ht.delete(num);
        }
        System.out.println();
        ht.displayTable();

    }

    static void test2() {
        var list = new SortedList();
        Link link;
        int key;

        list.insert(new Link(5));
        list.insert(new Link(22));
        list.insert(new Link(15));
        list.insert(new Link(10));
        list.insert(new Link(3));
        list.insert(new Link(2));
        list.insert(new Link(13));
        list.insert(new Link(9));
        list.displayList();
        key = 15;
        link = list.find(key);
        if (link != null) {
            System.out.printf("found key %d\n", link.getKey());
        } else {
            System.out.printf("key %d not found\n", key);
        }
        int[] nums = {17, 25, 10, 2, 15, 22, 3, 5, 9, 13};
        System.out.printf("deleting ");
        for (var num : nums) {
            System.out.printf("%d ", num);
            list.delete(num);
        }
        System.out.println();
        list.displayList();
    }
}
