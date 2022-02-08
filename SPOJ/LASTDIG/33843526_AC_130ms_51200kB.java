

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-->0) {
            int b = in.nextInt();
            int p = in.nextInt();

            int res = power(b, p,10);

            System.out.println(res % 10);
        }


    }

    public static int power(int b, int e, int m) {
        int result = 1;
        while (e > 0) {
            if (e % 2 == 1) {
                result = (result * b) % m;
            }
            b = (b * b) % m;
            e /= 2;
        }
        return result;
    }
}
