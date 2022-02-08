
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            if (findTrailingZeros(i) > m) {
                break;
            }
            if (findTrailingZeros(i) == m) {
                count++;
                list.add(i);
                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println(count);
        Collections.sort(list);
        if (count > 1) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }
    }

    static int findTrailingZeros(int n) {
        if (n < 0) {
            return -1;
        }

        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

}
