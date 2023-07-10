import java.util.Scanner;

/*      
 *      @author Mehmet Akif Şahin
 *      Section 2 - 22203673
 *      Lab - 5 - Question 2
 *      @date 10 / 11 / 2022
 *      Falling Stars
 */

public class Lab5_Q1 {
    public static void main(String[] args) {
        //input
        System.out.print("Please enter \'falling stars\' as string: ");
        Scanner in = new Scanner(System.in);
        String fallingStars = in.next();
        in.close();

        //finding the tallest falling star's length
        int tallest = -1;
        for (int i = 0; i < fallingStars.length(); i++)
        {
            int value = Character.getNumericValue(fallingStars.charAt(i));
            tallest = value > tallest ? value : tallest; 
        }

        //printing falling stars
        System.out.printf("Falling stars:\n%s\n", fallingStars);
        for (int column = 0; column < tallest; column++)
        {            
            for (int row = 0; row < fallingStars.length(); row++)
            {
                if(Character.getNumericValue(fallingStars.charAt(row)) <= column){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
