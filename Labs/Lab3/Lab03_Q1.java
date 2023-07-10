import java.util.Locale;
import java.util.Scanner;

/*
 * Mehmet Akif Şahin Lab 202 - 3 Question 1
 * 20 October 2022
 * This program calculates if the student satisfies graduation requirements.
 */

public class Lab03_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter your credit units: ");
        int creditUnits = input.nextInt();
        
        System.out.print("Enter your CGPA: ");
        double CGPA = input.nextDouble();

        input.close();

        if (creditUnits > 120)
        {
            if (CGPA > 2)
            {
                System.out.println("Graduation requirements are satisfied.");
            }
            else
            {
                System.out.println("The CGPA is not sufficient.");
                System.out.println("Graduation requirements are NOT satisfied.");
            }
        }
        else
        {
            System.out.println("The credit units are not sufficient.");
            System.out.println("Graduation requirements are NOT satisfied.");
        }
    }
}
