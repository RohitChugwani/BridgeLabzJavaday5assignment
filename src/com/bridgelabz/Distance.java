package com.bridgelabz;
import java.util.*;
public class Distance {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the horizontal distance from origin");
        int x = scn.nextInt();
        System.out.println("enter the vertical distance from origin");
        int y = scn.nextInt();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance from origin is" +distance);

    }
}
