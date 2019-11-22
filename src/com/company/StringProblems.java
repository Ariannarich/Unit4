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
    int vowels = 0;
        int count=0;

        while ( count < s.length())
        {

            if ('a'== (s.charAt(count)) || 'A'== (s.charAt(count))) {
                vowels++;
                count++;
            }
            else if ('e'== (s.charAt(count)) || 'E'== (s.charAt(count))) {
                vowels++;
                count++;
            }
            else if ('i'== (s.charAt(count)) || 'I'== (s.charAt(count))) {
                vowels++;
                count++;
            }
            else if ('o' == (s.charAt(count)) || 'O' ==(s.charAt(count))) {
                vowels++;
                count++;
            }
            else if ('u'== (s.charAt(count)) || 'U' == (s.charAt(count))) {
                vowels++;
                count++;
            }
            else
                count++;

    }
        return vowels;
    }
    public static String differentStrings(String s1, String s2)
    {

        int count=0;
        int length1 = s1.length()-1;
        int length2 = s2.length()-1;
        String str= "";
        String string1 = s1.substring(count,count +1);
        String string2 = s2.substring(count,count+ 1);

        if (length1 <= length2 || length2 <= length1)  {

             if (!string1.equals(string2))
             {
                 while (count <= length2 || count <= length2)
                 {
                    s1.substring(count,count +1);
                    s2.substring(count,count+ 1);
                         count++;
                 }
                     str =  s1 + "and "+ s2 + "are not the same. They differ at letter number " + count;
             }

             else if (string1.equals(string2))
            {
                while (count <= length2 || count <= length2)
                {
                    string1 = s1.substring(count,count +1);
                    string2 = s2.substring(count,count+ 1);
                        count++;
                    }

            }
            str= s1+ " and "+ s2 +" are the same";

                }


        return str;
    }
    public static boolean isPalindrome(String s)
    {
        int count = 0;
       int length = s.length();

        while ( count < length){
            String word= s.substring(count, count+1);
            String palindrome = s.substring(length-1, length);
            if (word.equals(palindrome.toUpperCase()) || word.toUpperCase().equals(palindrome)|| word.equals(palindrome))
        {
                    length--;
                    count++;
    }

              else
                  return false;
        }
            return true;
    }
}
