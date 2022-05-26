package com.bridgelabz;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scn.nextInt();
        if (input % 2 == 0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }
}
