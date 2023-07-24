package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class QuotientNReminder {
    public static void main(String[] args) {
        int dividend,divisor;
        Scanner r=new Scanner(System.in);

        System.out.print("Enter dividend: ");
        dividend=r.nextInt();

        System.out.print("Enter divisor: ");
        divisor=r.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
