package com.raitech.linkedlist;

class LinkedStackApp {
    public static void main(String[] args) {
        var stack = new LinkedStack();
        stack.push(20, 20.5);
        stack.push(40, 40.5);
        stack.displayStack();

        stack.push(60, 60.5);
        stack.push(80, 80.5);
        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}
