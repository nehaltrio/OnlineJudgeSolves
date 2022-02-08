
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int q = in.nextInt();

        int[] sum = new int[q];

        for (int i = 0; i < q; i++) {

            int a = in.nextInt();
            int b = in.nextInt();

            if (a == b) {
                sum[i] = arr[a];
            } else {
                for (int j = a; j <= b; j++) {
                    sum[i] += arr[j];
                }
            }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(sum[i]);
        }

    }
}
