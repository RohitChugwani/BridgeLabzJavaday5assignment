package com.bridgelabz;
import java.util.*;

public class Swap {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("before swapping:");
        System.out.println("a:" +a);
        System.out.println("b:" +b);

        a = a * b;
        b = a / b;
        a= a/b;
        System.out.println("after swapping:");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
}
