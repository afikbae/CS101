import java.util.Scanner;

/*
 * Mehmet Akif Şahin
 * CS101-2
 * Lab B-202
 * Lab 2 Question 2
 */

public class Lab02_Q2 {
    public static void main(String[] args) {
        final double TOTAL_COST = 237760;

        final double SITE_WORK_COST = 15903;
        final double FOUNDATIONS_COST = 25671;
        final double FRAMING_COST = 41123;
        final double EXTERIOR_COST = 33066;
        final double UTILITY_COST = 32746;
        final double INTERIOR_FINISHES_COST = 67939;
        final double OUTDOOR_COST = 16591;

        final double UNEXPECTED_COST = TOTAL_COST
        - SITE_WORK_COST
        - FOUNDATIONS_COST
        - FRAMING_COST
        - EXTERIOR_COST
        - UTILITY_COST
        - INTERIOR_FINISHES_COST
        - OUTDOOR_COST;

        final double SITE_WORK_COST_PERCENTAGE = SITE_WORK_COST / TOTAL_COST * 100;
        final double FOUNDATIONS_COST_PERCENTAGE = FOUNDATIONS_COST / TOTAL_COST * 100;
        final double FRAMING_COST_PERCENTAGE = FRAMING_COST / TOTAL_COST * 100;
        final double EXTERIOR_COST_PERCENTAGE = EXTERIOR_COST / TOTAL_COST * 100;
        final double UTILITY_COST_PERCENTAGE = UTILITY_COST / TOTAL_COST * 100;
        final double INTERIOR_FINISHES_COST_PERCENTAGE = INTERIOR_FINISHES_COST / TOTAL_COST * 100;
        final double OUTDOOR_COST_PERCENTAGE = OUTDOOR_COST / TOTAL_COST * 100;
        final double UNEXPECTED_COST_PERCENTAGE = UNEXPECTED_COST / TOTAL_COST * 100;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the cost of building a house in USD: ");
        double costOfHouse = in.nextDouble();

        System.out.println("\n\n*************************************************\n*****     House Cost Distribution Table     *****\n*************************************************");
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%19.2f" + "    *\n","Site Work", Math.floor(SITE_WORK_COST_PERCENTAGE), SITE_WORK_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%18.2f" + "    *\n","Foundations", Math.floor(FOUNDATIONS_COST_PERCENTAGE), FOUNDATIONS_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%18.2f" + "    *\n","Framing", Math.floor(FRAMING_COST_PERCENTAGE), FRAMING_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%18.2f" + "    *\n","Exterior", Math.floor(EXTERIOR_COST_PERCENTAGE), EXTERIOR_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%18.2f" + "    *\n","Utility", Math.floor(UTILITY_COST_PERCENTAGE), UTILITY_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%18.2f" + "    *\n","Interior Finishes", Math.floor(INTERIOR_FINISHES_COST_PERCENTAGE), INTERIOR_FINISHES_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%19.2f" + "    *\n","Outdoor", Math.floor(OUTDOOR_COST_PERCENTAGE), OUTDOOR_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%%" + "%1.0f" + "%19.2f" + "    *\n","Unexpected Costs", Math.floor(UNEXPECTED_COST_PERCENTAGE), UNEXPECTED_COST_PERCENTAGE * costOfHouse / 100);
        System.out.printf("* %-21s" + "%21.2f" + "    *\n","TOTAL", costOfHouse);
        System.out.println("*************************************************");

        in.close();
    }
}