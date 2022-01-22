package com.company;

import java.util.Scanner;

//Take integer inputs till the user enters 0
// and print the sum of all numbers (HINT: while loop)
public class number2 {

    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0)
                break;
            sum += num;
        }

        System.out.println("Sum: " + sum);



    }
}
