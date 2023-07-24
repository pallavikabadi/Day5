package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class VowelsNConstant {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Alphabets: ");
        char ch=r.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " : is Vowel");
                break;
            default:
                System.out.println(ch + " : is consonant");

        }

    }
}
