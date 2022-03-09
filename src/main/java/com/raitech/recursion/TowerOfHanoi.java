package com.raitech.recursion;

class TowerOfHanoi {
    static int nDisks = 3;

    public static void main(String[] args) {
        towerOfHanoi(nDisks, 'A', 'B', 'C');
    }

    static void towerOfHanoi(int n, char source, char inter, char dest) {
        if (n == 1) {
            System.out.printf("Disk 1 from %c to %c\n", source, dest);
        } else {
            towerOfHanoi(n - 1, source, dest, inter);
            System.out.printf("Disk %d from %c to %c\n", n, source, dest);
            towerOfHanoi(n - 1, inter, source, dest);
        }
    }
}
