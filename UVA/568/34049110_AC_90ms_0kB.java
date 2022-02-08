
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int fact = 1;
            int res = 0;
            for (int i = 1; i <= n; i++) {
                fact *= i;
                while (fact % 10 == 0) {
                    fact /= 10;
                }
                fact %= 100000;
                res = fact % 10;
            }

            System.out.printf("%5d -> %d\n",n,res);
        }

    }
}
