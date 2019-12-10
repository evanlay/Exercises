// Evan Lay 3B
package com.company;

public class    exercises {
    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(11));
        System.out.println(addOdds(13));
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(sumDigits(45));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(11));
        sillyNumbers();
        sillyNumbers2();
        dollarsAndStars();
    }

    public static int addOdds(int n) {
        int x = 1;
        int total = 0;
        for (x = 0; x < n; x++) {
            x++;
            total += x;
        }
        return total;
    }

    public static int howManyYears(double x, double y) {
        int year = 0;
        while (x < y) {
            year++;
            x += x * .0113;
        }
        return year;
    }

    public static int sumDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

    public static void sillyNumbers() {
        int x = 0;
        int y = 9;
        for (x = 0; x <= y; x++) {
            for (int z = 0; z < 3; z++) {
                System.out.print(x);
            }
        }
        System.out.println("");
    }

    public static void sillyNumbers2() {
        int x = 0;
        int y = 0;
        for (int w = 0; w < 4; w++) {
            for (x = 9; x > y; x--) {
                for (int z = 0; z < x; z++) {
                    System.out.print(x);
                }
            }
            System.out.println("");
        }
    }

    public static void dollarsAndStars() {
        for (int x = 0; x < 7; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 14; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 7; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 2; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 6; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 12; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 6; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 2; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 4; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 10; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 4; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 6; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 4; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 8; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 4; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 6; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 8; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 3; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 6; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 3; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 8; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 10; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 2; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 4; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 2; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 10; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.println("");
        }
        for (int x = 0; x < 12; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 2; x++) {
            System.out.print("*");
        }
        for (int x = 0; x < 1; x++) {
            System.out.print("$");
        }
        for (int x = 0; x < 12; x++) {
            System.out.print("*");
        }
    }
}
/*
25
36
49
7
27
9
1
2
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

 */