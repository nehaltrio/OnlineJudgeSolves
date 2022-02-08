

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int minF = Math.min(A,B);
        int minS = Math.min(C,D);

        System.out.println(minF+minS);

    }
}
