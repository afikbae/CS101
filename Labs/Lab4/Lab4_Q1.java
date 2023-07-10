

import java.util.Scanner;

public class Lab4_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        boolean inputIsSuitable = false;
        while (!inputIsSuitable)
        {
            System.out.print("Please input n: ");
            if (input.hasNextInt())
            {
                n = input.nextInt();
            }
            else
            {
                input.next();
            }
            inputIsSuitable = n > 0;
        }
        int digitsOfN = (int) Math.log10(n) + 1;

        input.close();

        int invertedN = 0;
        int counter = 0;
        while (counter < digitsOfN) 
        {
            int digit = n % (int)Math.pow(10, counter + 1) / (int)Math.pow(10, counter);
            invertedN += digit * Math.pow(10, digitsOfN - counter - 1);
            counter++;
        }

        System.out.println(invertedN);
    }
}
