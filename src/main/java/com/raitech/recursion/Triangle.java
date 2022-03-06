package com.raitech.recursion;

class Triangle {
    int triangleRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + triangleRecursive(n - 1);
    }

    int triangleIterative(int n) {
        var total = 0;
        while (n > 0) {
            total += n;
            n--;
        }
        return total;
    }
}
