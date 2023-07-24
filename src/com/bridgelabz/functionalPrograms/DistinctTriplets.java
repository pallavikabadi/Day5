package com.bridgelabz;

import java.util.Scanner;

public class DistinctTriplets {
    public static void main(String[] args) {
        Scanner Trip=new Scanner(System.in);
        System.out.println("Enter the values of 3elements");
        int[] arr=new int[5];
        boolean found = false;
        for (int i=0;i<arr.length;i++){
            int a= Trip.nextInt();
            arr[i]=a;
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        found=true;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        if (found==false){
            System.out.println("Not exist!");
        }
    }
}
