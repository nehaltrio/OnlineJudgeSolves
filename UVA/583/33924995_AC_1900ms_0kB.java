
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            long n = in.nextLong();

            if (n == 0L) {
                break;
            }

            ArrayList<Long> list = prime_factorize(Math.abs(n));

            if (n > 0) {
                System.out.print(n + " = " + list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    System.out.print(" x " + list.get(i));
                }
            } else {
                System.out.print(n + " = " + -1);
                for (int j = 0; j < list.size(); j++) {
                    System.out.print(" x " + list.get(j));
                }
            }
            System.out.println();
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
