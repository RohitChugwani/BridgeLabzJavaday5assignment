package com.bridgelabz;
import java.util.*;
public class SnakeLadder {
    public static void main(String[] args)
    {
        int start_position=0;
        int count=0;

        while (start_position<100)
        {
            count++;
            int dice_number = (int)(Math.random()*10%6+1);
            int option = (int)(Math.random()*10%3+1);
            if(option==1)
            {
                start_position=start_position+dice_number;
                if (start_position>100)
                {
                    start_position=start_position-dice_number;
                }
            }
            if(option==2)
            {
                start_position=start_position-dice_number;
                if (start_position<0)
                    start_position=0;
            }
            System.out.print("no of chances:" +count);
            System.out.println("current position of player:" +start_position);
        }
    }
}
