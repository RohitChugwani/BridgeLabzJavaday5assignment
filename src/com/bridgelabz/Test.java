package com.bridgelabz;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class Test {
    public static void main(String[] args)
    {
        int count=1;
        System.out.println("enter the number");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        while(input>10)
        {
            input = input/10;
            count++;
        }
        System.out.println("number of digits are" +count);
    }
}
