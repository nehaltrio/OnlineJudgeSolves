
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(System.out);
        String str = in.nextLine();

        int m = in.nextInt();
        int len = str.length();
        Integer[] arr = new Integer[len];


        Arrays.fill(arr,0);
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                arr[i + 1]++;
            }
        }

        for (int i = 1; i < len; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }


        for (int i = 0; i < m; i++) {
            pw.println(Math.abs(arr[in.nextInt() - 1]
                    - arr[in.nextInt() - 1]));
        }
        pw.close();

    }

}