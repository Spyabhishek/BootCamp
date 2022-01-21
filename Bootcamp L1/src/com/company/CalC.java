package com.company;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /)
// and calculate the value. (Use if conditions)
public class CalC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ans;
        System.out.println("Enter the First No.");
        a = sc.nextInt();
        System.out.println("Enter the Second No");
        b = sc.nextInt();
        System.out.println("Enter the Operator");
        char op = sc.next().charAt(0);

        if (op == '+') { ans = a + b;
            System.out.println(ans);}
        else if (op == '-') { ans = a - b;
            System.out.println(ans);}
        else if (op == '*') { ans =  a * b;
            System.out.println(ans); }
        else if(op == '/') { ans = a  / b;
            System.out.println(ans); }
        else System.out.println("please enter the valid operator");

    }
}
