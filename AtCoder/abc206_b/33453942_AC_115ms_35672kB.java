
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;

        if (N == 1) {
            System.out.println(1);
        } else if (N == 0) {
            System.out.println(0);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            for (int i = 1; i <= N; i++) {
                if (sum >= N) {
                    System.out.println(i - 1);
                    break;
                } else {
                    sum += i;
                }
            }
        }
    }
}
