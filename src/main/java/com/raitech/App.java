package com.raitech;

import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        test1();
    }

    static void test1() {
        for (int i = 0; i < 50; i++) {
            var x = new Random().nextInt((9));
            System.out.printf("%d ", x);
        }
        System.out.println();
    }

    static void test() {
        var list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);
    }
}
