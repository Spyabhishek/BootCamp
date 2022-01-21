package com.company;

import java.util.Scanner;

//To find Armstrong Number between two given number
public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the First No.");
        a = sc.nextInt();
        System.out.println("Enter the Second No.");
        b = sc.nextInt();

        for (int i = a; i< b; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }

    }

}
