package com.raitech.util;

class Math {
    public static void main(String[] args) {
        var n = 17;
        var p = isPrime(n);
        System.out.printf("is %d prime? %b", n, p);
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        // The loop terminates at i == n/2 because we cannot find
        // any factor for n beyond the number n/2.
        // So, any iteration beyond n/2 is redundant.
        for (var i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime2(int n) {
        System.out.printf("n = %d\n", n);
        for (var j = 2; (j * j) <= n; j++) {
            System.out.printf("j = %d, ", j);
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    static int getPrime(int min) {
        for (var i = min + 1; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }
}
