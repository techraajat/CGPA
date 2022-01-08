package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner Percentage = new Scanner(System.in);

        System.out.println("Enter  marks sub 1");
        float  a = Percentage.nextFloat();
        System.out.println("Enter marks sub 2");
        float  b = Percentage.nextFloat();
        System.out.println("Enter marks sub 3");
        float  c = Percentage.nextFloat();
        System.out.println("Enter marks sub 4");
        float  d = Percentage.nextFloat();
        System.out.println("Enter marks sub 5");
        float  e = Percentage.nextFloat();
        float  f =(a+b+c+d+e)/5;
        System.out.print("Percentage of the Student : ");

        System.out.println(f);
    }
}
