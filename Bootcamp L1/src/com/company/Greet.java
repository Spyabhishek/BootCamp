package com.company;

import java.util.Scanner;

//Take name as input and print a greeting message for that name.
public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter Your Name");
        str = sc.nextLine();

        System.out.println("Hello"+" "+ str);

    }
}
