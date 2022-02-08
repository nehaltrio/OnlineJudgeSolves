
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            if (arr[0] + arr[1] > arr[arr.length - 1]) {
                System.out.println(-1);
            } else {
                System.out.println("1 " + "2 " + n);
            }

        }
    }

}
