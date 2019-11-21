package com.company;

public class ForLoops {

    public static String printingHashTags(int num) {
        String hash = "";
        for (int count = 1; count <= num; count++)
            hash += "#";
        return hash;
    }

    public static String countDown(int a, int b)
    {
        String str = "";
  if (a <= b) {
        for (int count = b; count >= a; count--)
            str  += count + " ";
  }
  else if  (b < a)
  {
      str = "";
  }
  return str;
    }
    public static String countDown2(int a, int b) {
        String str = "";
        if (a >= b )  {
            for (int count = a; count >= b; count--)
                str  += count + " ";
        }
        else if (b >= a)
        {
            for (int count = b; count >= a; count--)
                str  += count + " ";
    }

        return str;
}

   public static int sumNumbers(int num1, int num2)
   {int sum=0;
       if (num2 > num1)

       {
            for (int count = num1; count <= num2; count++)
          sum += count;
       }
       else if (num1 > num2)
       {
           for (int count = num2; count <= num1; count++)
           sum += count;
       }
return sum;
   }
    public static void main(String[] args) {

        System.out.println(countDown(0,10));

    }

}
