package com.raitech.stack;

public class StackApp {
    public static void main(String[] args) {
        testStack();
        reverseWord("james");
    }

    static void reverseWord(String input) {
        var stack = new Stack<Character>(input.length());
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        var output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = stack.pop();
            output = output + ch;
        }
        System.out.println(output);
    }

    static void testStack() {
        var stack = new Stack<Integer>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (!stack.isEmpty()) {
            var item = stack.pop();
            System.out.println(item);
        }
    }

    static void testStack2() {
        var stack = new Stack<String>(10);
        stack.push("Rabia");
        stack.push("Naveed");
        stack.push("Zainab");

        while (!stack.isEmpty()) {
            var item = stack.pop();
            System.out.println(item);
        }
    }
}
