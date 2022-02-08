
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int st = n + 1;
        int cnt = 0;

        for (int i = 0; i < n; ++i) {

            st = Math.min(st, arr[i]);

            if (st == arr[i]) {
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}
