/**
 * PellNumber
 * this program calculates the pell number sequence iteratively and recursively 
 * and measures the time taken by the two implementation method
 */
public class PellNumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i = i + 5)
        {
            long start = System.nanoTime();
            long result = calcPellA(i);
            long end = System.nanoTime();
            System.out.printf("%-25d // for n = %d P_%d is calculated in %d nanoseconds\n", result, i, i, end - start);
        }
        for (int i = 0; i <= 50; i = i + 5)
        {
            long start = System.nanoTime();
            long result = calcPellB(i);
            long end = System.nanoTime();
            System.out.printf("%-25d // for n = %d P_%d is calculated in %d nanoseconds\n", result, i, i, end - start);
        }
    }

    public static long calcPellA (int n)
    {
        if (n < 2) return n;
        return 2 * PellNumber.calcPellA(n-1) + PellNumber.calcPellA(n-2);
    }

    public static long calcPellB (int n)
    {
        if (n < 2) return n;
        long prev = 0;
        long current = 1;
        long next = 0;
        int i = 2;
        while (i <= n)
        {
            next = 2 * current + prev;
            prev = current;
            current = next;
            i++;
        }
        return next;
    }
}