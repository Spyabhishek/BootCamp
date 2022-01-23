package com.company;

import java.util.Scanner;
//Sum Of N Numbers
public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i=0 , sum=0;
        System.out.println("Enter the no. you want to get sum upto");
        a = sc.nextInt();

//        for (int i = 0; i <=a; i++) {
//             sum = sum + i;
//        }
//        System.out.println("The sum upto"+ " "+a+ " "+ "is"+ " "+ sum);

        //WHILE
        while(i<=a){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum upto"+ " "+a+ " "+ "is"+ " "+ sum);
    }
}
