import java.util.Scanner;

/*
 * Mehmet Akif Şahin Lab 202 - 3 Question 2
 * 20 October 2022
 * This program verifies the 3-7 digit given number is palindromic or not.
 */

public class Lab03_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        int numberOfDigits = (int) Math.log10(number) + 1;

        if (numberOfDigits < 3 || numberOfDigits > 7)
        {
            System.out.print("The input is invalid! The number must be between 3 and 7 digits long.\n");
            System.out.printf("The number has %d digits\n", numberOfDigits);
        }
        else
        {
            System.out.printf("The number has %d digits\n", numberOfDigits);
            if (numberOfDigits == 3 && number / 100 == number % 10)
            {
                System.out.printf("%d is a palindromic number.\n", number);
            }
            else if (numberOfDigits == 4 && number / 1000 == number % 10 && (number / 100) % 10 == (number % 100) / 10)
            {
                System.out.printf("%d is a palindromic number.\n", number);
            }
            else if (numberOfDigits == 5 && number / 10000 == number % 10 && (number / 1000) % 10 == (number % 100) / 10)
            {
                System.out.printf("%d is a palindromic number.\n", number);
            }
            else if (numberOfDigits == 6 && number / 100000 == number % 10 && (number / 10000) % 10 == (number % 100) / 10 && (number / 1000) % 10 == (number % 1000) / 100)
            {
                System.out.printf("%d is a palindromic number.\n", number);
            }
            else if (numberOfDigits == 7 && number / 1000000 == number % 10 && (number / 100000) % 10 == (number % 100) / 10 && (number / 10000) % 10 == (number % 1000) / 100)
            {
                System.out.printf("%d is a palindromic number.\n", number);
            }
            else
            {
                System.out.printf("%d is NOT a palindromic number.", number);
            }
        }
        input.close();
    }
}