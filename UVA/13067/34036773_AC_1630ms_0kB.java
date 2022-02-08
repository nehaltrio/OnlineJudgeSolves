

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            long n = in.nextLong();
            if (n==1L){
                break;
            }
            System.out.println(prime_factorize(n).size());
        }
    }

    public static ArrayList<Long> prime_factorize(long n) {
        ArrayList<Long> result = new ArrayList<>();

        for (long i = 2; (i * i) <= n; ++i) {

            while (n % i == 0) {

                result.add(i);

                n /= i;
            }
        }

        if (n != 1) {
            result.add(n);
        }
        return result;
    }

}
