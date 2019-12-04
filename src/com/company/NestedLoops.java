package com.company;

import java.util.Scanner;

public class NestedLoops {
    static Scanner input = new Scanner(System.in);

    public static String xSquare() {
        String blank = "";

        for(int x = 1; x <= 5; x++)
            {
                for(int y = 1;y <= 5;y++)
                    blank += "X";
                blank += "\n";
            }

        return blank;
    }

    public static String xSquare2(int n) {
        String blank = "";

        for(int x = 1; x <= n; x++)
        {
            for(int y = 1; y <= n; y++)
                blank += "X";
            blank += "\n";
        }
        return blank;
    }

    public static String flippedTriangle(int n) {
        String blank = "";
        for(int x = 1; x <= n; x++)
        {
            for(int y = n ; y >= x; y--)
                blank += "*";
            blank += "\n";
        }
        return blank;
    }
    public static String multiplicationTable() {
        String blank = "";
        for(int x = 1; x <= 9; x++)
        {
            for(int y = x; y <= 9 * x; y+=x)
                {
                    if (y < 10)
                        blank += "  " + y;
                    else
                        blank += " " + y;
                }
            blank += "\n";
        }
        return blank;

    }
    public static void main(String[] args) {
        int n = input.nextInt();
        System.out.println(xSquare2(n));
        int n2 = input.nextInt();
        System.out.println(flippedTriangle(n2));


    }

}


