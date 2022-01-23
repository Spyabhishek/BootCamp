package com.company;

import java.util.Scanner;

//Reverse A String In Java
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, str= "";
        char ch;
        System.out.println("Enter a string you want to reverse");
        a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i); //Extract each character
            str = ch + str; 
        }
        System.out.println("Reverse of string is:" +" "+ str);
    }
}
