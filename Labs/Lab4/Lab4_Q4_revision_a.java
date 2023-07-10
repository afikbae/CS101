/*
    Mehmet Akif Şahin 22203673
    Lab4 - Q4 - revision A
    
    This program calculates the area of the curve x^2 * sin(x) * cos(x) using reimann integral.
*/

public class Lab4_Q4_revision_a {
    public static void main(String[] args) {
        double x_start = 0;
        double x_end = Math.PI/2;
        double step_size = 0.005;
        double total_area = 0;

        double x = x_end;
        while (x > x_start)
        {
            total_area += step_size * (x * x * Math.cos(x) * Math.sin(x));
            x -= step_size;
        }

        System.out.println("The function is: x^2 * cos(x) * sin(x)\n"
        + "Parameters:\n"
        + "x_start = 0, x_end = π / 2\n"
        + "step_size = 0.005\n"
        + "Area under \"x^2 * cos(x) * sin(x)\" from 0 to π / 2: " + total_area);
}
}