package com.company;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n ;
        int  a=0, b=1;
        System.out.println("Enter the nth No.");
        n = sc.nextInt();
        System.out.println("Fibonacci Series is:");
        while (sum <= n) {
            System.out.println(sum + " ");
            a = b; //swap the no.
            b = sum;
            sum = a + b; //next term is the sum of two no.
        }
    }
}
