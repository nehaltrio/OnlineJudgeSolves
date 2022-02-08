

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] prime = sieveOfEratosthenes(1000000);


        while (true) {
            int n = in.nextInt();
            if (n==0){
                break;
            }

            int count = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % 2 == 0 || i == 2) {
                    if (prime[i] && prime[n - i]) {
                       count++;
                    }
                }
            }

            System.out.println(count);
        }


    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }

        primes[0] = false;
        primes[1] = false;

        for (int i = 0; i * i <= n; i++) {

            if (primes[i]) {
                for (int j = 2; i * j <= n; j++) {
                    primes[i * j] = false;
                }
            }

        }

        return primes;

    }
}