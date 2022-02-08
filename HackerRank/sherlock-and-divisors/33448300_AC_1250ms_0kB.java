

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        while (k-- > 0) {
            long num = in.nextLong();
            int count = 0;
            for (long i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (i % 2 == 0) {
                        count++;
                    }
                    if ((num/i) % 2 == 0 && i != num / i) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
