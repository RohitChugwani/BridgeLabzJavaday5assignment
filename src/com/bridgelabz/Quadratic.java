package com.bridgelabz;
import java.util.*;
public class Quadratic {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter value of a,b,c");
        int a = scn.nextInt();
        int b= scn.nextInt();
        int c = scn.nextInt();
        double delta = Math.sqrt(b*b-4*a*c);
        double root1= (delta-b)/(2*a);
        double root2= (-b-delta)/(2*a);
        System.out.println("roots are"+root1 + "," +root2);
    }
}
