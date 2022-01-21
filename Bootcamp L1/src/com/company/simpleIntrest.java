package com.company;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user
// and find Simple Interest.
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float P, T, R, SI;
        System.out.print("Enter the principal");
        P = sc.nextInt();
        System.out.print("Enter the rate");
        R = sc.nextInt();
        System.out.print("Enter the time");
        T = sc.nextInt();


        SI = (P * R * T) / 100;
        System.out.print("Simple Intrest" + SI);

    }
}
