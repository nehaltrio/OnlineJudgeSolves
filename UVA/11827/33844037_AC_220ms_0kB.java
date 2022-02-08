
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();

            String str = in.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(str);

            while (tokenizer.hasMoreTokens()) {
                list.add(Integer.parseInt(tokenizer.nextToken()));
            }

            int[] arr = list.stream().mapToInt(i -> i).toArray();

            System.out.println(pair(arr, arr.length));
        }


    }

    static int pair(int[] arr, int n) {

        int maxVal = -1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int res = gcd(arr[i], arr[j]);
                if (res >= maxVal) {
                    maxVal = res;
                }
            }
        }

        return maxVal;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
