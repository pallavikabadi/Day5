package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = Input.nextInt();
        b = Input.nextInt();
        System.out.println("before swapping numbers:"+"a="+a +" "+"b="+ b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping:"+"a="+a +"  "+"b=" + b);
        System.out.println( );
    }
}
