/*
    Mehmet Akif Şahin 22203673
    Lab4 - Q2
    
    This program takes a positive integer input and outputs its binary form.
*/

import java.util.Scanner;

public class Lab4_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = input.nextInt();
        input.close();
        long binaryForm = 0;
        while (n > 0)
        {
            int log2nFloored = (int) (Math.log(n) / Math.log(2));
            binaryForm += Math.pow(10, log2nFloored);
            n = n - (int) Math.pow(2, log2nFloored);
        }
        System.out.println(binaryForm);
    }
}
