package com.raitech.recursion;

class TriangleApp {
    public static void main(String[] args) {
        test1();
        test2();
    }

    static void test1() {
        System.out.println("Recursive Triangle");
        var t = new Triangle();
        int[] nums = {1, 2, 3, 4, 5};
        for (var num : nums) {
            var answer = t.triangleRecursive(num);
            System.out.println(String.format("triangle(%d) = %d", num, answer));
        }
    }

    static void test2() {
        System.out.println("Iterative Triangle");
        var t = new Triangle();
        int[] nums = {1, 2, 3, 4, 5};
        for (var num : nums) {
            var answer = t.triangleIterative(num);
            System.out.println(String.format("triangle(%d) = %d", num, answer));
        }
    }
}
