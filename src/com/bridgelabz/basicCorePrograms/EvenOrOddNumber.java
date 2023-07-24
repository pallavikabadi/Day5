package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner R=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = R.nextInt();
        if (num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
