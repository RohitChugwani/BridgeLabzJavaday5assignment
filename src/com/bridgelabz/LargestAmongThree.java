package com.bridgelabz;
import java.sql.SQLOutput;
import java.util.*;

public class LargestAmongThree {
    public static void main( String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int arr[];
        arr= new int[3];
        for ( int i=0;i<=2;i++)
        {
            System.out.println("enter the "+ (i+1) +"number");
            arr[i] = scn.nextInt();
            System.out.println(arr[i]);
        }
        if ( arr[0] > arr[1])
        {
            if ( arr[0] > arr[2])
                System.out.println( "Greatest number is" +arr[0]);
            else
                System.out.println(" Greatest number is " +arr[2]);

        }
        else
            if (arr[1] > arr[2])
                System.out.println("greatest number is" +arr[1]);
            else
                System.out.println("greatest number is" +arr[2]);

    }
}
