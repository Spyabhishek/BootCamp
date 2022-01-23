package com.company;
import java.util.Scanner;

//Factorial Program In Java
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.(For Factorial):");
        int a = sc.nextInt();
        int b = 1;
        int i = 1;
//        for (int i = 1; i <= a; i++) {
//            b = b * i;
//        }
//            System.out.println("Factorial of no." + a + " "+"is" +"  "+ b);

        //WHILE

        while(i <= a){
            b = b * i;
            i++;
        }

        System.out.println("Factorial of no." + a + " "+"is" +" "+ b);

        }
    }

