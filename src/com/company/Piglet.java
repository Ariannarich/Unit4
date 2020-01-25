package com.company;

import java.util.Scanner;
// Arianna Richardson
// November 19th 2019
// this program plays the game of Pig: to earn points you need to roll a die consecutively gaining points until you get a value of 1.
// If you roll a 1, you lose all of your points.
public class Piglet {
    public static void main(String[] args) {

        System.out.println(rollRandom());

    }

    static Scanner input = new Scanner(System.in);

    // Rolls a random number.
    public static String rollRandom() {
        int points = 0;
        int num = (int) (Math.random() * 6) + 1;
        String yOrN = null;
        String str = "";
        while (num != 1) {
            System.out.println("You rolled a " + num);
            points += num;
            System.out.println("Roll again?");// Asks to roll die again.
            yOrN = input.nextLine();
            if (yOrN.equals("yes")) {
                points += num;
                num = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled a " + num);
                points += num;
                System.out.println("Roll again?");
                yOrN = input.nextLine();
            } else if (yOrN.equals("no")) { //Stops rolling and totals the scores from all rolls.
                str += ("You got " + points + " points!");
                return str;
            }
        }

                if (num == 1)// loses all points if you roll 1, resulting in a score of 0.
                    str += "You rolled a 1; you got 0 points.";
                    return str;
                }
            }






//End code.

