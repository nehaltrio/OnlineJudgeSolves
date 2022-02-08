
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t =in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            double res = 0;

            res = ((double) k / m) * (n - 1);

            System.out.printf("%.10f\n", res);
        }
    }
}
