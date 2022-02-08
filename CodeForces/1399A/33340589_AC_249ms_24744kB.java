

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        int k = in.nextInt();

        while (k --> 0) {
            int N = in.nextInt();
            Integer[] arr = new Integer[N];

            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);


            boolean check = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] <= 1) {
                    continue;
                }
                check = true;
            }

            if (check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
