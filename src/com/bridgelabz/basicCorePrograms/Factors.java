package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int n,i;
        Scanner FAC=new Scanner(System.in);
        System.out.println("Enter the FAC values: ");
        n= FAC.nextInt();
        System.out.println("The factors of"+n+"are: ");
        for (i=1;i<=n;i++){
            if (n%i==0){
                //              n=n/i;
                System.out.println(i+"");
            }
            //          System.out.println("n");
        }
    }
}
