
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int x = 1;

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.print("Case " + x + ": "+n+" = ");
            factorize_factorial_v1(n);
            x++;
        }
    }

    public static void factorize_factorial_v1(int n) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                89, 97, 101, 103, 107, 109, 113, 127, 131, 137,
                139, 149, 151, 157, 163, 167, 173, 179, 181, 191};

        int index = 0;

        for (int i = 0;  n >= primes[i];  i++) {
            index = i;
        }


        for (int i = 0; i < primes.length; i++) {
            int p = primes[i];

            if (p > n) {
                break;
            }

            int expo = 0;
            int ppow = p;

            while (ppow <= n) {
                expo += (n / ppow);
                ppow *= p;
            }

            if (i == index)
            {
                System.out.printf("%d (%d)", p, expo);
            }
            else
            {
                System.out.printf("%d (%d) * ", p, expo);
            }
        }
        System.out.println();
    }
}
