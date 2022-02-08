

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = n + 1; i <= 10000; i++) {
            if (unique(i)) {
                System.out.println(i);
                break;
            }
        }


    }

    public static boolean unique(int n) {
        int sum;

        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            sum = n % 10;
            n = n / 10;
            list.add(sum);
        }

        Set<Integer> set = new HashSet<>(list);


        return set.size() >= list.size();
    }
}
