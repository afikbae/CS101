import java.util.Scanner;

/*
    Mehmet Akif Şahin 22203673 
    Lab 6 - revision
*/

public class Lab6_Q1_revision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the first natural number: ");
        int firstNaturalNumber = in.nextInt();
        System.out.print("Please input the second natural number: ");
        int secondNaturalNumber = in.nextInt();
        System.out.println("Binary representation of the first number: " + Lab6_Q1_revision.intToBinary(firstNaturalNumber));
        System.out.println("Binary representation of the second number: " + Lab6_Q1_revision.intToBinary(secondNaturalNumber));
        System.out.println("The bitwise XOR operation result: " + Lab6_Q1_revision.binaryXOR(firstNaturalNumber, secondNaturalNumber));
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
    public static long binaryXOR (int a, int b)
    {
        long a_binary = Lab6_Q1_revision.intToBinary(a);
        long b_binary = Lab6_Q1_revision.intToBinary(b);
        
        int numberOfDigits = 0;
        if (a > b) numberOfDigits = (int)Math.log10(a_binary) + 1;
        else numberOfDigits = (int)Math.log10(b_binary) + 1;
        
        int result = 0;
        
        for (int i = 0; i < numberOfDigits; i++)
        {
            int digit_a = (int)(a_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));
            int digit_b = (int)(b_binary % (int) Math.pow(10,i + 1) / (int) Math.pow(10, i));

            int digit_result = (1 - ((1 - digit_a)*(1 - digit_b))) * (1 - (digit_a*digit_b));

            result = result + digit_result * (int) Math.pow(10,i);
        }
        return result;
    }
}
