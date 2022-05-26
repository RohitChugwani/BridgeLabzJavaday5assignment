package com.bridgelabz;
import java.util.*;

public class QuotientRemainder {
    public static void main( String[] args)
    {
        System.out.println("enter dividend");
        Scanner scn = new Scanner(System.in);
        int div = scn.nextInt();
        System.out.println("enter divisor:");
        int divisor = scn.nextInt();
        System.out.println("quotient is" +(div/divisor));
        System.out.println("remainder is" +(div%divisor));


    }
}
