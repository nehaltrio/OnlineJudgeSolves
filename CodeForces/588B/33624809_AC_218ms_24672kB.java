
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();


        for (long i = 2; i * i <= N; i++) {
            while (true) {
                if (N % (i * i) != 0) {
                    break;
                }
                N = (N / i);
            }
        }

        System.out.println(N);


    }
}
