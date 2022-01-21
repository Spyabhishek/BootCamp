package com.company;

import java.util.Scanner;

//Input currency in rupees and output in USD
public class rsToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Enter the amount in Rupees");
        a = sc.nextInt();

        b = (0.013 * a);
        System.out.println(b + " " + "USD");
    }
}
