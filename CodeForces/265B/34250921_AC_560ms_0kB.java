
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int cnt = 2 * n - 1;

        for (int i = 0; i < n - 1; i++) {
            cnt += Math.abs(arr[i + 1] - arr[i]);
        }

        cnt += arr[0];
        System.out.println(cnt);


    }
}
