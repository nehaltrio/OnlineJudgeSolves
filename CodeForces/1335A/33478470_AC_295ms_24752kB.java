
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        while (k-->0) {
            int n = in.nextInt();

            if (n % 2 == 0) {
                System.out.println((n / 2) - 1);
            } else {
                System.out.println((n / 2));
            }
        }
    }
}
