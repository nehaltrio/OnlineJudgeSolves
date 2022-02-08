

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            list.add(x);
        }

        int max = Collections.max(list);

        int res = 0;

        for (int i = 0; i < N; i++) {

             res += max - list.get(i);
        }

        System.out.println(res);

    }
}
