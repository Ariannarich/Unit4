import java.util.Scanner;

public class FizzBuzz {
    static Scanner input = new Scanner(System.in);

    public static String fizzBuzz(int n) {
        String blank = "";
            for (int y = 1; y <= n; y++)
                if(y % 20 ==0) {

                    if (y % 5 == 0 && y % 3 == 0) {
                        blank += "FizzBuzz ";
                        blank += "\n";
                    }
                    else if (y % 3 == 0) {
                        blank += "Fizz ";
                        blank += "\n";
                    }
                    else if (y % 5 == 0)
                    {
                        blank += "Buzz ";
                        blank += "\n";
                    }
                    else {
                        blank += y + " ";
                        blank += "\n";
                    }
                }
            else {
                    if (y % 5 == 0 && y % 3 == 0)
                        blank += "FizzBuzz ";
                    else if (y % 3 == 0)
                        blank += "Fizz ";
                    else if (y % 5 == 0)
                        blank += "Buzz ";
                    else
                        blank += y + " ";
                }
        return blank;
    }

    public static void main(String[] args) {
       System.out.print("Max value?:");
        int n = input.nextInt();
        System.out.println(fizzBuzz(n));
    }
}