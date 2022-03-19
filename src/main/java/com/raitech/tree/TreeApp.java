package com.raitech.tree;

class TreeApp {
    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
//        tree.insert(15);
//        tree.insert(22);

        var key = 17;
        var found = tree.find(key);
        if (found != null) {
            System.out.printf("Found Node with key %d\n", found.data);
        } else {
            System.out.printf("Did not find Node with key %d\n", key);
        }
        System.out.println("inorder");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("preorder");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("postorder");
        tree.postorder(tree.root);
        System.out.println();
//        var min = tree.minimum();
//        System.out.printf("min = %d\n", min != null ? min.data : -1);
//        var max = tree.maximum();
//        System.out.printf("max = %d\n", max != null ? max.data : -1);
    }
}
