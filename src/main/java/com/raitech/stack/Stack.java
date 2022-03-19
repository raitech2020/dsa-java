package com.raitech.stack;

import java.util.ArrayList;

public class Stack<T> {
    private int maxSize;
    private ArrayList<T> stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new ArrayList<T>(maxSize);
        top = -1;
    }

    public void push(T item) {
        if (!isFull()) {
            stackArray.add(++top, item);
        } else {
            System.out.println("Stack is full");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return stackArray.remove(top--);
        }
        return null;
    }

    public T peek() {
        return stackArray.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
