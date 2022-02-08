

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            int N = in.nextInt();
            int sum = 0;
            for (int i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    sum += i;
                    if (i != N / i) {
                        sum += N / i;
                    }
                }
            }

            System.out.println(sum - N);
        }

    }
}
