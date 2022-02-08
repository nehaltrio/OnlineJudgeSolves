
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int sum = 0;
        int count = 0;
        int i = 2;
        while (true) {
            if (prime(i)) {
                sum += i;
                count++;
                if (sum % k == 0) {
                    break;
                }
            }

            i++;
        }


        System.out.println(count);
    }

    public static boolean prime(int n) {
        if (n == 1) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
