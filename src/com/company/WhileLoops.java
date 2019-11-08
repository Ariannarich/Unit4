package com.company;

import java.util.Scanner;

public class WhileLoops {
    static Scanner input = new Scanner(System.in);

    public static String FromHeretoThere(int num1, int num2) {
        if (num1 > num2)
            return "invalid input.";
        else {
            while (num1 < num2) {
                System.out.println(num1 + " ");
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
    public static String countPosAndNeg()
    {
        int num = input.nextInt();
while(num != 0) {
    return ("Enter a positive or negative number or 0 to quit: ");
    input.nextInt();
}
if (num > 0)
    return "There were " +num +"positive numbers";
    }
    public static void main(String[] args) {

        System.out.println("First number:");
        int num1= input.nextInt();
        System.out.println("Second number:");
        int num2= input.nextInt();
        System.out.println("Number to be factored:");
       int y = input.nextInt();
        System.out.println(FromHeretoThere(num1,num2));
        System.out.println(Factor(y));
    }
}