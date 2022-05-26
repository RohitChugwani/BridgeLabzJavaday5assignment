package com.bridgelabz;
import java.sql.SQLOutput;
import java.util.*;

public class FlipCoin {
    public static void main(String[] args)
    {
        String arr[];
        int count_tail=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of times you want to flip the coin");
        int input=scn.nextInt();
        arr = new String[input];
        for (int i=0;i<input;i++)
        {
            double coin = Math.random();
            if ( coin >=0.5)
            {
              arr[i] = "tail";
            }
            else
            {
                arr[i] = "head";
            }
        }
        for ( int i=0;i< arr.length;i++)
        {
            System.out.println( arr[i]);
            if ( arr[i] == "tail")
            {
                count_tail++;
            }
        }
        double percent_tail;
        percent_tail = count_tail*100/input;

        System.out.println("percentage of tails = " +percent_tail);
        System.out.print("percent of heads");
        System.out.println(100-percent_tail);
    }
}
