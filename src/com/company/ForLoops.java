package com.company;

public class ForLoops {

    public static String printingHashTags(int num) {
        String hash = "";
        for (int count = 0; count <= num; count++)
            hash = "#";
        return hash;
    }

    public static String countDown(int a, int b) {
        String str = "";
        if (a < b) {
            for (int count = a; count <= b; count++)
                str = count + " ";
        } else
            str = "";
        return str;
    }

    public static String countDown2(int a, int b) {
        String str = "";
        if (a < b) {
            for (int count = a; count <= b; count++)
                str = count + " ";
        } else if (b > a) {
            for (int count = a; count <= b; count++)
                str = count + " ";
        }
        return str;
    }
   public static int sumNumbers(int num1, int num2)
   {
       for (int count = num1; count <= num2; count++)
           count += num1;
return num1;

   }
}
