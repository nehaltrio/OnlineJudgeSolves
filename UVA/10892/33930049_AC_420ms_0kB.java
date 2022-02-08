
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

            ArrayList<Long> list = divisors(n);

            long[] arr = list.stream().mapToLong(i -> i).toArray();

            int res = pair(arr, arr.length, n);

            System.out.println(n + " " + res);
        }

    }


    public static int pair(long[] arr, int len, long n) {

        int count = 0;
        for (int i = 0; i < len ; i++) {
            for (int j = i ; j < len; j++) {
                long res = lcm(arr[i], arr[j]);
                if (res == n) {
                    count ++;
                }
            }
        }

        return count;
    }

    public static ArrayList<Long> divisors(Long n) {
        ArrayList<Long> divisors = new ArrayList<>();

        divisors.add(1L);
        for (long i = 2; i * i <= n; ++i)
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) divisors.add(n / i);
            }

        if (n!=1L){
            divisors.add(n);
        }

        return divisors;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
