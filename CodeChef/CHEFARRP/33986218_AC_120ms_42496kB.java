

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int[] arr = new int[n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int sum = 0, prod = 0;

            for (int i = 0; i < n; i++) {
                prod = arr[i];
                sum = arr[i];
                for (int j = i + 1; j < n; j++) {
                    if (prod == sum) {
                        count++;
                        prod *= arr[j];
                        sum += arr[j];
                    } else {
                        prod *= arr[j];
                        sum += arr[j];
                    }

                }
                if (prod == sum) {
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}
