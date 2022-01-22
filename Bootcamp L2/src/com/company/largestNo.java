package com.company;


import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class largestNo {
    public static void main(String[] args) {
        int i = 0, input = 0, large=0;
        System.out.print("Enter a series of values (0 to quit): ");
        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) != 0) {
            large = Integer.max(large, input);
            i++;
        }
        if (i > 0) {
            System.out.println("The largest integer is: " + large);

        }
    }
}