package com.demo.prime;

public class PrimeTable {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void printTable(int n) {
        System.out.println("Table of " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please enter 3 numbers");
            return;
        }

        for (String s : args) {

            int num = Integer.parseInt(s);

            if (isPrime(num)) {
                printTable(num);
            } else {
                System.out.println(num + " / 10 = " + (num / 10));
            }

            System.out.println("-------------------");
        }
    }
}
