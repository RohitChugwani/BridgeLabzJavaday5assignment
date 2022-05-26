package com.bridgelabz;
import java.util.*;

public class PowerOfTwo {
    public static void main( String[] args)
    {
        System.out.println("enter the power");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int result =1;
        for (int i=1;i<=input;i++)
        {
            result=2*result;
        }
        System.out.println(result);
    }
}
