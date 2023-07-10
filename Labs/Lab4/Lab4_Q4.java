/*
    Mehmet Akif Şahin 22203673
    Lab4 - Q4
    
    This program calculates the area under the curves using reimann integral.
*/

public class Lab4_Q4 {
    public static void main(String[] args) {
        {
            double x_start = 0;
            double x_end = 1;
            double step_size = 0.01;
            double total_area = 0;

            double x = x_end;
            while (x > x_start)
            {
                total_area += step_size * x * x;
                x -= step_size;
            }

            System.out.println("The function is: x^2\n"
            + "Parameters:\n"
            + "x_start = 0, x_end = 1\n"
            + "step_size = 0.01\n"
            + "Area under \"x^2\" from 0 to 1: " + total_area);
        }
        {
            double x_start = 0;
            double x_end = 1;
            double step_size = 0.01;
            double total_area = 0;
    
            double x = x_end;
            while (x > x_start)
            {
                total_area += step_size * (Math.sin(Math.PI * x) + Math.sin(Math.PI * 3 * x) / 3);
                x -= step_size;
            }
    
            System.out.println("\nThe function is: sin(PI*x) + sin(PI*3*x)/3\n"
            + "Parameters:\n"
            + "x_start = 0, x_end = 1\n"
            + "step_size = 0.01\n"
            + "Area under \"sin(PI*x) + sin(PI*3*x)/3\" from 0 to 1: " + total_area);
        }
    }
}
