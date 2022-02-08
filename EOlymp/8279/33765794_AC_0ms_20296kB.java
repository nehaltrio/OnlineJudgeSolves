

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

      int n = in.nextInt();

        System.out.println(total(n));

    }

    public static int total(int N) {

        int sum = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += (N / i);
                }
            }
        }

        return sum;

    }
}
