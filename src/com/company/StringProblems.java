package com.company;

public class StringProblems {
    public static String printTheLetters(String s)
    {
        String str = "";

for (int count = 0 ; count < s.length(); count++)
    str += s.substring(count, count+ 1) + "\n" ;
return str;
}
    public static String everyOtherLetter(String s)
    {
        String str = "";
        int count = 0;

        while (count < s.length())
        {
            if (count % 2 == 0 || count == 0)
            {
                str += s.substring(count, count+ 1);
            count++;}
            else
                count++;
        }
        return str;
    }
    public static int countTheVowels(String s)
    {
    int vowels=0;
        int count=1;
        int num= 0;

        while ( count < s.length())
        {

            if ('a'== (s.charAt(count)) || 'A'== (s.charAt(count))) {
                num++;
                count++;
            }
            else if ('e'== (s.charAt(count)) || 'E'== (s.charAt(count))) {
                num++;
                count++;
            }
            else if ('i'== (s.charAt(count)) || 'I'== (s.charAt(count))) {
                num++;
                count++;
            }
            else if ('o' == (s.charAt(count)) || 'O' ==(s.charAt(count))) {
                num++;
                count++;
            }
            else if ('u'== (s.charAt(count)) || 'U' == (s.charAt(count))) {
                num++;
                count++;
            }
            else
                count++;

    }
        return num;
    }
    public static String differentStrings(String s1, String s2)
    {
        String str = "";
        int count=0;
        int count2=0;
        int num = 0;
        int index1 = s1.indexOf(s1);
        int index2 = s2.indexOf(s2);

        if (index1 <= index2)
            while (count <= index1)
        {
                if (s1.charAt(count) != s2.charAt(count2))
                {
                    num++;
                    count2++;
                    count++;
                }
                else
                    count++;
        }
       else if (index2 <= index1)
            while (count <= index2)
            {
                if (s2.charAt(count) != s1.charAt(count2))
                {
                    str += num++;
                    count2++;
                    count++;
                }
                else
                  count++;
            }
        return str;
    }
    public static boolean isPalindrome(String s)
    {
        int count=0;
        int count2= s.length() - 1;
        boolean x = s.charAt(count) == s.charAt(count2);
        if (x)
             {
             while (count <= count2)
             {
                count2--;
                count++;
             }

            return x;
    }
        else
            return false;
}
}