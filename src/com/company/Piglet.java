package com.company;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        System.out.println(rollRandom());

    }

    static Scanner input = new Scanner(System.in);

    public static int rollRandom() {
        int points = 0;
        int num = (int) (Math.random() * 6 + 1);
        String yOrN;.
        while (num != 1) {

                System.out.println("You rolled a " + num);
               num += points;
                System.out.println("Roll again?");
                yOrN = input.nextLine();
                if (yOrN.equals("no")){
                    System.out.println("You got " + num + " points!");
                break;}
                else
                    System.out.println(rollAgain(yOrN));
                num = (int) (Math.random() * 6 + 1);



            System.out.println("You got 0 points.");
            return num;
        }



     public static String rollAgain(String yOrN)
    {
                if (yOrN.equals("yes"))
                  return ""+(rollRandom());

        return yOrN;
    }
}