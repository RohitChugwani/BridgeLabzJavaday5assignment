package com.bridgelabz;
import java.util.*;
public class Harmonic {
    public static void main(String[] args)
    {
        double harmonic = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the harmonic term");
        int input = scn.nextInt();
        for (double i=1;i<=input;i++)
        {
            double x = 1/i ;
            System.out.println(x);
            harmonic = harmonic + x;
        }
        System.out.println("harmonic number:" +harmonic);

    }
}
