

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum+=arr[i];
        }

        Arrays.sort(arr);
        int res =0;
        if (sum >= X){
            System.out.println(N);
        }else {
            res = X - sum;
            int total = (res/arr[0]) + N;
            System.out.println(total);
        }





    }
}
