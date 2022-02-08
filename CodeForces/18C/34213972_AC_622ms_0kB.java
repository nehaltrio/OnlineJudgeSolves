import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N+1];



        for (int i = 1; i <= N; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] sum = generateSum(N, arr);
        int count = 0;


        for (int i = 1; i < N; i++) {
            if (sum[i] == sum[N] - sum[i]) {
                count++;
            }
        }
        System.out.println(count);


    }

    public static int[] generateSum(int n, int[] arr) {
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        return sum;
    }
}
