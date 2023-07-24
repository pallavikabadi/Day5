package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class LargestAmong3Number {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner L = new Scanner(System.in);
        System.out.println("enter first number: ");
        num1 = L.nextInt();
        System.out.println("Enter second number: ");
        num2 = L.nextInt();
        System.out.println("Enter thrid number: ");
        num3 = L.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is greater: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is greater: " + num2);
        } else if (num3 >= num1 && num3 >= 2) {
            System.out.println("num3 is greater:" + num3);
        } else
            System.out.println("ALL are EQUAL");
    }
}
