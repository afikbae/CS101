/*
    Mehmet Akif Şahin 22203673
    Lab4 - Q4 - revision B
    
    This program calculates the area of two series expansions of functions using reimann integral.
*/

public class Lab4_Q4_revision_b {
    public static void main(String[] args) {
        double x_start = 0;
        double x_end = 1;
        double step_size = 0.01;
        double total_area = 0;

        double x = x_end;
        while (x > x_start)
        {
            double yOfFirstFunction = 0;
            int k = 1;
            int n = 6;
            while (k <= n)
            {
                yOfFirstFunction += Math.sin((2 * k - 1) * Math.PI * x) / (2 * k - 1);
                k++;
            }
            double yOfSecondFunction = 0;
            k = 1;
            while (k <= n)
            {
                yOfSecondFunction += 0.2 * Math.sin(k * x) / k;
                k++;
            }
            total_area += step_size * (yOfFirstFunction - yOfSecondFunction);
            x -= step_size;
        }

        System.out.println("Parameters:\n"
        + "x_start = 0, x_end = 1\n"
        + "step_size = 0.01\n"
        + "Total area: " + total_area);
    }
}
