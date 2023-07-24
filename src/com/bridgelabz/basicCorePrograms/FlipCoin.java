package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads=0;
        int tails=0;
        int counter=1;
        double randNam=0.0;
        double HeadPercentage =0.0;
        double TailPercentage =0.0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of times coins fliped :  ");
        int flips =s.nextInt();
        while(counter <= flips){
            randNam=Math.random();
            System.out.println(counter +" " + randNam);
            if(randNam< .5){
                heads++;
                System.out.println("heads");
            }else {
                tails++;
                System.out.println("tails");
            }
            counter++;
        }
        System.out.println();
        System.out.println("No of Heads= " + heads);
        System.out.println("No of Tails=" + tails);
        System.out.println();
        HeadPercentage = (heads * 100 / flips);
        TailPercentage = (tails * 100 / flips);
        System.out.println();
        System.out.println(HeadPercentage);
        System.out.println(TailPercentage);
    }
}
