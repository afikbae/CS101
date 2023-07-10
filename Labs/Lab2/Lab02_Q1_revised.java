import java.util.Locale;
import java.util.Scanner;

/*
 * Mehmet Akif Şahin
 * CS101-2
 * Lab B-202
 * Lab 2 Question 1 revised
 */

public class Lab02_Q1_revised {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("\nEnter lenght of the semi major axis of the ellipse: ");
        double semiMajorAxisLenght = scanner.nextDouble();

        System.out.print("Enter lenght  of the semi minor axis: ");
        double semiMinorAxisLenght = scanner.nextDouble();

        double areaOfTheEllipse = Math.PI * semiMinorAxisLenght * semiMajorAxisLenght;
        double circumferenceOfTheEllipse = 2 * Math.PI * Math.pow(((semiMajorAxisLenght * semiMajorAxisLenght) + (semiMinorAxisLenght * semiMinorAxisLenght)) / 2, 0.5);

        System.out.printf("\nThe area of the ellipse is              : %11.3f\n", areaOfTheEllipse);
        System.out.printf("The circumference of the ellipse is ~   : %11.3f\n\n", circumferenceOfTheEllipse);

        System.out.print("Enter length of the side lenght of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        double area = Math.pow(sideLength,2) * Math.pow(3, 0.5) / 4;
        double circumference = sideLength * 3;
        double height = sideLength * Math.pow(3, 0.5) / 2;

        System.out.printf("\nThe area of the equilateral triangle is = %f\n", area);
        System.out.printf("The circumference of the equilateral triangle is = %f\n", circumference);
        System.out.printf("The height of the equilateral triangle is = %f\n", height);

        scanner.close();
    }
}
