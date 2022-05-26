package com.bridgelabz;
import java.util.*;
public class VowelConsonant {
    public static void main( String[] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter any character");
        char input = scn.next().charAt(0);
        if ( input == 'a'|| input == 'e' || input == 'i' || input == 'o' || input == 'u'|| input =='A' || input=='E'
         || input=='I' || input =='O' || input=='U')
        {
             System.out.println("character is vowel");
        }
        else
        {
            System.out.println("character is consonant");
        }
    }
}
