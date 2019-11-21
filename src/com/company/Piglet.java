package com.company;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        System.out.println(rollRandom());

    }

    static Scanner input = new Scanner(System.in);

    public static String rollRandom() {
        int points = 0;
        int num = (int) (Math.random() * 6 + 1);
        String yOrN;
        String str = "";
        if (num != 1) {
            System.out.println("You rolled a " + num);
            points += num;
            System.out.println("Roll again?");
            yOrN = input.nextLine();

            if (yOrN.equals("yes"))
                while (yOrN.equals("yes")) {
                    num = (int) (Math.random() * 6 + 1);
                    System.out.println("You rolled a " + num);
                points += num;
                    System.out.println("Roll again?");
                    yOrN = input.nextLine();
                }
             if (yOrN.equals("no")) {
               str += ("You got " + points + " points!");
            }
            num = (int) (Math.random() * 6 + 1);
        }
        else if (num == 1)
            str +=  "You rolled a 1; you got 0 points.";

return str;

    }
}