package com.raitech.tree;

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    void displayNode() {
        System.out.printf("%d \n", data);
    }
}
