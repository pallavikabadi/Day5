package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        int[][] array = new int[m][n];
        //This for loop is for taking elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextInt();
            }
        }
        //This for loop is for iterating Array Element
        System.out.println("The array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
