package com.company;

import java.util.Scanner;

//Area
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        //CIRCLE
       /* System.out.println("Enter the radius");
        a = sc.nextInt();

        b = 3.14 * a;
        System.out.println("Area of circle is:" + b); */

        //TRIANGLE
     /* System.out.println("Enter the height");
        a = sc.nextInt();
        System.out.println("Enter the base");
        b = sc.nextInt();

        c = (a * b) / 2;
        System.out.println("Area of triangle" + " "+ c); */

        //RECTANGLE  //PARALLELOGRAM
     /* System.out.println("Enter the length");
        a = sc.nextInt();
        System.out.println("Enter the width");
        b = sc.nextInt();

        c = a * b;
        System.out.println("Area of Rectangle is"+ " "+ c);  */

        //RHOMBUS
     /*   System.out.println("Enter the diagonal1");
        a = sc.nextInt();
        System.out.println("Enter the diagonal2");
        b = sc.nextInt();

        c = (a * b) / 2;
        System.out.println("Area of Rhombus is"+ " "+ c);  */

        //Equilateral Triangle
    /*    System.out.println("Enter the side");
        a = sc.nextInt();

        c = 0.433012 * (a * a);
        System.out.println("Area of Equilateral Triangle is"+ " "+ c); */

        //**************** PERIMETER ****************
        //Circle
    /*    System.out.println("Enter the radius");
        a = sc.nextInt();

        c = (2 * 3.14) * a;
        System.out.println("Perimeter of circle is"+ " "+ c);  */

        // Rhombus = 4 * a;
        // Rectangle = 2  * (a + b);
        // Equilateral Triangle = 3 * a;
        // Parallelogram = 2 * (a + b);

        //****************  VOLUME *************
        //Cone
        System.out.println("Enter the radius");
        a = sc.nextInt();
        System.out.println("Enter the height");
        b = sc.nextInt();

        c = 3.14 * (a * a) * (b / 3);
        System.out.println("Volume of cone is"+ " "+ c);



    }
}
