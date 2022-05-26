package com.bridgelabz;
import java.util.*;

public class TwoDArray {
    public static void main(String[] args)
    {
        //int arr = new int[][];

        System.out.println("enter number of rows");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        System.out.println("enter number of columns");
        int column = scn.nextInt();
        int [][] arr = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println("enter data");
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            System.out.println();
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j] );

            }
        }

    }
}
