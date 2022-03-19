package com.raitech.tree;

class Tree {
    Node root;

    Node find(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current, parent;
        current = root;

        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    boolean delete(int key) {
        Node current, parent;
        boolean isLeftChild = false;
        current = parent = root;

        if (current == null) { // empty tree
            // nothing to delete
            return false;
        }

        while (key != current.data) {
            parent = current;
            if (key < current.data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) { // didn't find the node
                return false;
            }
        }
        // found node
        // if current is leaf node
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) { // root node needs to be deleted
                root = null;
                return true;
            }
            if (isLeftChild) {
                parent.leftChild = null; // disconnect from parent
            } else {
                parent.rightChild = null;
            }
        }
//        Todo: delete
        return false;
    }

    void inorder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        inorder(localRoot.leftChild);
        System.out.printf("%d ", localRoot.data);
        inorder(localRoot.rightChild);
    }

    void preorder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        System.out.printf("%d ", localRoot.data);
        preorder(localRoot.leftChild);
        preorder(localRoot.rightChild);
    }

    void postorder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        postorder(localRoot.leftChild);
        postorder(localRoot.rightChild);
        System.out.printf("%d ", localRoot.data);
    }

    Node minimum() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    Node maximum() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }
}
