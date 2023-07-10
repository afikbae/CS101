package lab6;

/*
    Mehmet Akif Şahin 22203673 
    Lab 6
*/

import java.util.Scanner;

public class Lab6_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // password decoder
        System.out.print("Please input the password: ");
        int password = in.nextInt();
        int decodedPassword = Lab6_Q1.passwordDecoder(password);
        System.out.println("The decoded password is: " + decodedPassword);

        // prime summation
        System.out.print("Please input the natural number: ");
        int naturalNumber = in.nextInt();
        int sumOfPrimeFactors = Lab6_Q1.primeSummation(naturalNumber);
        System.out.println("The summation of the prime factors of " + naturalNumber + " is " + sumOfPrimeFactors + ".");


        // pythagorean checker
        System.out.print("Please input the first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Please input the second number: ");
        int secondNumber = in.nextInt();
        System.out.print("Please input the third number: ");
        int thirdNumber = in.nextInt();
        if (isPythagorean(firstNumber, secondNumber, thirdNumber))
            System.out.println("The triplet is Pythagorean.");
        else
            System.out.println("The triplet is not Pythagorean.");

        // bitwise OR and AND
        System.out.print("Please input the first natural number: ");
        int firstNaturalNumber = in.nextInt();
        System.out.print("Please input the second natural number: ");
        int secondNaturalNumber = in.nextInt();
        System.out.println("Binary representation of the first number: " + Lab6_Q1.intToBinary(firstNaturalNumber));
        System.out.println("Binary representation of the second number: " + Lab6_Q1.intToBinary(secondNaturalNumber));
        System.out.println("The bitwise AND operation result: " + Lab6_Q1.binaryAND(firstNaturalNumber, secondNaturalNumber));
        System.out.println("The bitwise OR operation result: " + Lab6_Q1.binaryOR(firstNaturalNumber,secondNaturalNumber));
    
        in.close();
    }
    public static int floor(double x) 
    {
        return (int) (x - x % 1);
    }
    public static int digitDecoder (int digit)
    {
        return Lab6_Q1.floor(10 - Math.pow(digit / 2.0 - 3, 2) - 0.32);
    }
    public static int passwordDecoder (int password)
    {
        int decodedPassword = 0;
        int numberOfDigits = (int) Math.log10(password) + 1;
        for (int i = 0; i < numberOfDigits; i++)
        {
            int digit = password % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i);
            decodedPassword = decodedPassword + Lab6_Q1.digitDecoder(digit) * (int) Math.pow(10, i);
        }
        return decodedPassword;
    }
    public static boolean isPrime (int num)
    {
        // if the number is not divisible by a number equal or less than its root than that number is prime
        boolean isPrime = true;
        for (int i = 2; i*i <= num; i++)
        {
            if (num % i == 0) isPrime = false;
        }
        return isPrime;
    }
    public static int primeSummation(int num)
    {
        int sum = 0;
        for (int i = 2; i <= num; i++)
        {
            if (num % i == 0 && Lab6_Q1.isPrime(i)) 
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static int power(int a, int b)
    {
        int product = 1;
        for (int i = 0; i < b; i++) product = product * a;
        return product;
    }
    public static boolean isPythagorean(int a, int b, int c)
    {
        if (power(a, 2) == power(b, 2) + power(c, 2)
         || power(c, 2) == power(a, 2) + power(b, 2)
         || power(b, 2) == power(a, 2) + power(c, 2))
            return true;
        return false;
    }
    public static long intToBinary(int num)
    {
        int n = num;
        long binaryForm = 0;
        int digitCounter = 0;
        while (n > 0)
        {
            binaryForm += (n % 2) * Math.pow(10,digitCounter);
            digitCounter++;
            n /= 2;
        }
        return binaryForm;
    }
    public static long binaryAND (int a, int b)
    {
        long a_binary = Lab6_Q1.intToBinary(a);
        long b_binary = Lab6_Q1.intToBinary(b);
        
        int numberOfDigits = 0;
        if (a > b) numberOfDigits = (int)Math.log10(a_binary) + 1;
        else numberOfDigits = (int)Math.log10(b_binary) + 1;
        
        int result = 0;
        
        for (int i = 0; i < numberOfDigits; i++)
        {   
            int digit_a = (int)(a_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));
            int digit_b = (int)(b_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));

            int digit_result = digit_a * digit_b;

            result = result + digit_result * (int) Math.pow(10,i);
        }
        return result;
    }
    public static long binaryOR (int a, int b)
    {
        long a_binary = Lab6_Q1.intToBinary(a);
        long b_binary = Lab6_Q1.intToBinary(b);
        
        int numberOfDigits = 0;
        if (a > b) numberOfDigits = (int)Math.log10(a_binary) + 1;
        else numberOfDigits = (int)Math.log10(b_binary) + 1;
        
        int result = 0;
        
        for (int i = 0; i < numberOfDigits; i++)
        {
            int digit_a = (int)(a_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));
            int digit_b = (int)(b_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));

            int digit_result = 1 - ((1 - digit_a)*(1 - digit_b));

            result = result + digit_result * (int) Math.pow(10,i);
        }
        return result;
    }
}