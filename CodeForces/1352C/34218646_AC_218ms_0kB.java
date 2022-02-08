
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();

            System.out.println(binarySearch(n, k));
        }
    }

    public static int binarySearch(int n, int key) {
        int res = -1;
        int low = 0;
        int high = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int div = mid - (mid / n);
            if (div < key) {
                low = mid + 1;
            } else if (div > key) {
                high = mid - 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }


}
