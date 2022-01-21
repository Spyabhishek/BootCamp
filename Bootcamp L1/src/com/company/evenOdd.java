package com.company;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input.
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the no.");
        num = sc.nextInt();

        if(num % 2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");


    }
}
