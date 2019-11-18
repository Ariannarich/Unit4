package com.company;

import java.util.Scanner;

public class  WhileLoops {
    static Scanner input = new Scanner(System.in);

    public static String fromHereToThere(int num1, int num2) {
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


    public static String factors(int y) {
        int x = 1;
        while (x < y) {
            if (y % x == 0)
                return (x + " ");
            x++;
        }
        return String.valueOf(x);
    }

    public static String countPosAndNeg() {

        int num = input.nextInt();
        int pos = 0;
        int neg = 0;
        while (num != 0) {
            if (num >= 1)
                pos++;
            else if (num <= -1)
                neg++;
            System.out.println("Enter a positive or negative number or 0 to quit:");
            num = input.nextInt();
        }

        return "There were " + neg + " negative and " + pos + " positive numbers";
    }

    public static String findMinAndMax() {
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int num = 1;
        int num2 = input.nextInt();
        while (num <= 4) {
            System.out.println("Enter number: ");
            num2 = input.nextInt();
            num++;
        }

        if ( num2 > max )
            max = num2;
        if ( num2 < max )
            min = num2;
        return "max is:  " + max + " \n min is:  " + min;

    }
    public static double gradePoint() {
        double avg;
        double gpa = 0;
        System.out.println("Enter seven letter grades(A,B,C,D,E,F)");
        String letter;
        int count = 0;
        double grade = 1;
        int i = 1;
        while (count <= 7) {
            while (i <= count) {
            letter = input.next();
                if (letter.equals("A")) {
                    grade = 4.0;
                } else if (letter.equals("B")) {
                    grade = 3.0;
                } else if (letter.equals("C")) {
                    grade = 2.0;
                } else if (letter.equals("D")) {
                    grade = 1.0;
                } else if (letter.equals("F")) {
                    grade = 0.0;
                }
                 gpa += grade;
                i++;
            }
            count++;
        }

        gpa/=7;
        gpa *= 100;
        gpa = (int)gpa;
      avg = gpa/100;
        System.out.println("GPA is:" +avg);
        return avg;
    }
    public static void main(String[] args) {

        System.out.println(gradePoint());
    ;

    }
}