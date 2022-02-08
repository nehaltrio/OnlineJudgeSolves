
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        
        while (k-->0) {
            int N = in.nextInt();

            long[] arr1 = new long[N];
            long[] arr2 = new long[N];


            for (int i = 0; i < N; i++) {
                arr1[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                arr2[i] = in.nextInt();
            }
            long min1 = arr1[0], min2 = arr2[0];

            for (int i = 0; i < N; i++) {
                min1 = Math.min(min1, arr1[i]);
            }

            for (int i = 0; i < N; i++) {
                min2 = Math.min(min2, arr2[i]);
            }

            long res = 0;

            for (int i = 0; i < N; i++) {
                long res1 = Math.abs(arr1[i] - min1);
                long res2 = Math.abs(arr2[i] - min2);

                res += Math.max(res1, res2);
            }

            System.out.println(res);
        }

    }
}
