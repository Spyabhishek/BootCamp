package com.company;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b = "";
        System.out.println("Enter the String to check If it is Palindrome or not");
        a = sc.nextLine();
        int n = a.length();
        for (int i = n - 1; i>=0; i--){
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)){
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }

    }
}
