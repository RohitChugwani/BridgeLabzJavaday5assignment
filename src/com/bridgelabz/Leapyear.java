package com.bridgelabz;
import java.util.*;
public class Leapyear {
    public static void main(String[] args)
    {
        System.out.println("enter year");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year%4==0)
        {
            if (year%100==0)
                if (year %400 ==0)
                    System.out.println("its a leap year");
                else
                    System.out.println("its a not leap year");

            else
                System.out.println("its a leap year");

        }
        else
            System.out.println("its  not a leap year");
    }
}
