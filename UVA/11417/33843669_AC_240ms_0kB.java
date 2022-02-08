
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int N = in.nextInt();
            if (N == 0) {
                break;
            }
            int G = 0;
            for (int i = 1; i < N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    G += gcd(i, j);
                }

            }

            System.out.println(G);
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
