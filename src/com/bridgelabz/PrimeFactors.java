package com.bridgelabz;
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner scn = new Scanner(System.in);
        int input= scn.nextInt();
        int x=input;
        for( int i=2;i<= x ;i++)
        {
            if( input%i ==0)
            {
                System.out.print("prime factors are :" +i+ ",");
                input=input/2;
            }
        }
    }
}
