
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();

            System.out.print(n + " ");

            for (int i = 1; i < n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
