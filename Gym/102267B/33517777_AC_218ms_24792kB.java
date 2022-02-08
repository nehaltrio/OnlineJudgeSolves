
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();



        boolean check =false;

        for (int i = 1; i <= n / 2; i++) {
            if (n%2==0 || i==2) {
                if (prime(i) && prime(n - i)) {
                    System.out.println(i + " " + (n - i));
                    check = true;
                    break;
                }
            }
        }

        if (!check) {
            System.out.println(-1);
        }

    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
