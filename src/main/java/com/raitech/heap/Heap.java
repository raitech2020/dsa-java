package com.raitech.heap;

class Heap {
    Node[] heapArray;
    int maxSize;
    int currentSize;

    Heap(int max) {
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean insert(int key) {
        if (currentSize == maxSize) { // heap is full
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);
        currentSize++;
        return true;
    }

    void trickleUp(int index) {
        Node tempNode = heapArray[index];
        int parentIndex = (index - 1) / 2;

        while (index > 0 &&
                heapArray[parentIndex].getKey() < tempNode.getKey()) {
            // move the bigger parent in child
            heapArray[index] = heapArray[parentIndex];
            // update child and parent indexes
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
        // now either index == 0 (reached at top) or
        // child is smaller than parent (right position of child)
        heapArray[index] = tempNode;
    }

    Node remove() {
        Node rootNode = heapArray[0];
        // move the last node in root
        currentSize--;
        heapArray[0] = heapArray[currentSize];
        // move the new root to its proper place
        trickleDown(0);
        return rootNode;
    }

    void trickleDown(int index) {
        Node tempNode = heapArray[index];
        int leftChild, rightChild, largerChild;

        while (index < currentSize / 2) { // at least one child is present
            leftChild = index * 2 + 1;
            rightChild = leftChild + 1;

            if (rightChild < currentSize &&
                    heapArray[rightChild].getKey() > heapArray[leftChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (tempNode.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = tempNode;
    }

    boolean change(int index, int newVal) {
        if (index < 0 || index > currentSize) {
            return false;
        }
        var oldVal = heapArray[index].getKey();
        heapArray[index].setKey(newVal);
        if (newVal > oldVal) { // priority has been raised
            trickleUp(index);
        } else {
            trickleDown(index);
        }
        return true;
    }

    void displayHeap() {
        for (var i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.printf("%d ", heapArray[i].getKey());
            } else {
                System.out.printf("-- ");
            }
        }
        System.out.println();
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "...............................";
        System.out.println(dots + dots);
        while (currentSize > 0) { // for each heap item
            if (column == 0) // first item in row?
                for (int k = 0; k < nBlanks; k++) // preceding blanks
                    System.out.print(" ");
            // display item
            System.out.print(heapArray[j].getKey());
            if (++j == currentSize) // done?
                break;
            if (++column == itemsPerRow) { // end of row?
                nBlanks /= 2; // half the blanks
                itemsPerRow *= 2; // twice the items
                column = 0; // start over on
                System.out.println(); // new row
            } else // next item on row
                for (int k = 0; k < nBlanks * 2 - 2; k++)
                    System.out.print(" "); // interim blanks
        } // end for
        System.out.println("\n" + dots + dots); // dotted bottom line
    }

    void displayArray() {
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", heapArray[i].getKey());
        }
        System.out.println();
    }

    void insertAt(int index, Node newNode) {
        heapArray[index] = newNode;
    }

    void incrementSize() {
        currentSize++;
    }
}


