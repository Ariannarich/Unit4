package com.company;

import java.util.Scanner;

public class WhileLoops {
    static Scanner input = new Scanner(System.in);

    public static String FromHeretoThere(int num1, int num2) {
        if (num1 > num2)
            return "invalid input.";
        else {
            while (num1 < num2) {
                System.out.print(num1 + " ");
                num1++;

            }
            return String.valueOf(num1);
        }
    }


public static String Factor( int y)
{ int x = 1;
    while(x < y)
    {
       if (y % x == 0)
          return (x + " ");
       x++;
    }
    return String.valueOf(x);
}
    public static String countPosAndNeg() {
        System.out.println("Enter a positive or negative number or 0 to quit: ");
        int num = input.nextInt();
        while (num != 0) {
            System.out.println("Enter a positive or negative number or 0 to quit:");
            num = input.nextInt();
        }
            int pos=0;
            int neg=0;
            if (num > 0) {
                pos++;
                return "There were " + pos + "positive numbers";
            }
          if (num !=0 || num < 0)
            {
                neg++;
                return "There were " + neg + "negative numbers";
            }
         }

    public static void main(String[] args) {

        System.out.println(countPosAndNeg());
    }
}