
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        while (k-->0) {
            int m = in.nextInt();
            int n = in.nextInt();

            for (int i = m; i <= n; i++) {
                if (prime(i)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }

    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
