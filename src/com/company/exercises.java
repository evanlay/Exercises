package com.company;

public class exercises {
    public static void main(String[] args){
        System.out.println(addOdds(10));
        System.out.println(addOdds(11));
        System.out.println(addOdds(13));
        System.out.println(howManyYears(111.2,120));
        System.out.println(howManyYears(111.2,150));
        System.out.println(sumDigits(45));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(11));
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
        int year = 0 ;
        while (x < y) {
            year++;
            x+=x*.0113;
        }
        return year;
    }
    public static int sumDigits(int x) {
        int y = 0;
        int sum = 0;
        while (y < x) {
            y++;
            sum = y / 10;
            sum += y % 10;
        }
        return sum;
    }
}
