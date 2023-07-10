import java.util.Scanner;

/*      @author Mehmet Akif Şahin
 *      Section 2 - 22203673
 *      Lab - 5 - Question 2 - revision
 *      @date 10 / 11 / 2022
 *      Falling Stars
 */

public class Lab5_Q1_revision {
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
            if (fallingStars.charAt(i) != 'F') {
                int value = Character.getNumericValue(fallingStars.charAt(i));
                tallest = value > tallest ? value : tallest; 
            }
        }

        //printing falling stars
        System.out.println("Falling stars:");
        for (int i = 0; i < tallest; i++)
        {   
            for (int j = 0, k = 0; j < fallingStars.length();)
            {
                if(fallingStars.charAt(k) == 'F'){
                    j -= Character.getNumericValue(fallingStars.charAt(k+1)) - 1;
                    k += 1;
                }
                if(j==k){
                    if(Character.getNumericValue(fallingStars.charAt(k)) <= i){
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if (Character.getNumericValue(fallingStars.charAt(k-2)) == i + 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                if (j < k)
                {
                    j++;
                }
                if (j == k)
                {
                    k++;
                    j++;
                }
            }
            System.out.println();
        }
    }
}