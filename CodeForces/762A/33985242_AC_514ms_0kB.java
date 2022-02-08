import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        int k = in.nextInt();

        ArrayList<Long> list = new ArrayList<>();

        long i;
        for (i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
                if (i != N / i) {
                    list.add(N / i);
                }
            }
        }

        Collections.sort(list);


        if (list.size()+1 <= k) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}
