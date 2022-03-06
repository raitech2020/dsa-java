package com.raitech.recursion;

import java.text.DecimalFormat;

class Factorial {
    public static void main(String[] args) {
        var n = 9;
        test1(n);
    }

    static void test1(int n) {
        var result = factorial(n);
        var df = new DecimalFormat("###,###,###");
        df.format(result);
        System.out.println(String.format("Result = %s", df.format(result)));
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
