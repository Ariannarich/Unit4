package com.company;

import java.util.Scanner;

public class  WhileLoops {
    static Scanner input = new Scanner(System.in);

    public static String fromHereToThere(int num1, int num2) {
        String str = "";
        if (num1 > num2)
            return "Invalid input";
        else {
            while (num1 < num2) {
         str += num1 + " ";
                num1++;

            }
            return str;
        }
    }


    public static String factors(int y) {

String str = "";
        int x = 1;
        while (x <= y) {
            if (y % x == 0)
        str += x + " ";
            x++;
        }
return ("The factors of " + y + " are: "+ str);
    }

    public static String countPosAndNeg()
    {

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

        return "There were " + pos + " positive and " + neg + " negative numbers.";
    }

    public static String findMinAndMax() {
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int num = 1;
        int num2;
        while (num <= 5) {
            System.out.println("Enter number: ");
            num2 = input.nextInt();
            num++;


            if (num2 > max)
                max = num2;
            if (num2 < min)
                min = num2;
        }
        return "Max value is: " + max + "\nMin value is: " + min;

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
        System.out.println("GPA is :" +avg);
        return avg;
    }
    public static void main(String[] args) {

        System.out.println(factors(12));



    }
}