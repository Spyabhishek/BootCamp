package com.company;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number
public class largestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first no.");
        a = sc.nextInt();
        System.out.println("Enter the second no.");
        b= sc.nextInt();

//        System.out.println(Math.max(a, b));
        if (a > b) System.out.println(a + " " +"is the largest");
        else System.out.println(b + "  " +"is the largest");
    }
}
