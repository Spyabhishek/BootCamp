package com.company;


import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the no.");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if( a % i == 0) System.out.println(i);
        }
    }
}
