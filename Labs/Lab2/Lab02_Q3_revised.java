import java.util.Scanner;

/*
 * Mehmet Akif Şahin
 * CS101-2
 * Lab B-202
 * Lab 2 Question 3 revised
 */


public class Lab02_Q3_revised {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the title: ");
        String title = in.nextLine();
        System.out.println("--------------------------------------");


        System.out.printf("Number of characters:%s\n", title.length());
        System.out.printf("All lowercase:\"%s\"\n", title.toLowerCase());
        System.out.printf("Remove leading and trailing blank characters:\"%s\"\n", title.trim());
        System.out.printf("Character at index position 4:'%s'\n", title.charAt(4));
        System.out.printf("Title from 3rd character to 5th character (both included):\"%s\"\n", title.substring(2,5));
        System.out.printf("First occurence of character 'P':%s\n", title.indexOf("P"));
        System.out.printf("Last occurence of character 'P':%s\n", title.lastIndexOf("P"));

        in.close();

        String title1 = "Pride & Prejudice";

        title1 = title1.replace("d","D");
        title1 = title1.substring(title1.indexOf("&") + 2, title1.length()) + 
        " and " + title1.substring(0, title1.indexOf("&"));
        
        System.out.printf("\n%s\n", title1);
    }
}