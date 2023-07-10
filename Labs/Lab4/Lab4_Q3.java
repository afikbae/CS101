/*
    Mehmet Akif Şahin 22203673
    Lab4 - Q1
    
    This program takes a positive integer input and calculates its multiples of powers of two using bit shifting and outputs as binary.
*/

import java.util.Scanner;

public class Lab4_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean isOver = false;

        while (!isOver)
        {
            int n = 0;

            boolean inputIsSuitable = false;
            while (!inputIsSuitable)
            {
                System.out.print("Enter input n: ");
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

            long binaryForm = 0;
            while (n > 0)
            {
                int log2nFloored = (int) (Math.log(n) / Math.log(2));
                binaryForm += Math.pow(10, log2nFloored);
                n = n - (int) Math.pow(2, log2nFloored);
            }

            System.out.print("Please choose the operation. Division or Multiplication 'd' or 'm'?: ");
            String operation = input.next();
            System.out.print("Enter the multiplier or divisor that is a multiple of two: ");
            int divOrMul = input.nextInt();
            int operationCount = (int) (Math.log(divOrMul) / Math.log(2));
            if (operation.equals("m"))
            {
                int counter = 0;
                while (counter < operationCount)
                {
                    binaryForm *= 10;
                    counter++;
                }
            }
            else if (operation.equals("d"))
            {
                int counter = 0;
                while (counter < operationCount)
                {
                    binaryForm /= 10;
                    counter++;
                }
            }
            System.out.printf("0b%d\n", binaryForm);

            System.out.print("Do you want to do another operation? 'y' (yes) or 'n' (no): ");
            isOver = input.next().equals("n") ? true : false;
            System.out.println();
        }
        input.close();
        System.out.println("Program finished.");
    }
}
