

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long L = in.nextLong();
        long R = in.nextLong();

        ArrayList<Long> list = new ArrayList<>();
        if (L / 2019 != R / 2019) {
            System.out.println(0);
        } else {
            for (long i = L; i <= R; i++) {
                for (long j = i + 1; j <= R; j++) {
                    list.add(i * j % 2019);
                }
            }

            System.out.println(Collections.min(list));
        }
    }
}
