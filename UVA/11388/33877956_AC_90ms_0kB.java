

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int res1 = gcd(a, b);
            int res2 = lcm(a, b);

            if (a == res1 && b == res2) {
                System.out.println(res1 + " " + res2);
            } else {
                System.out.println(-1);
            }
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
