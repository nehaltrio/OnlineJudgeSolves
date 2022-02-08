

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            String str = in.nextLine();
            long n = Long.parseLong(str);
            if (n == 0L) {
                break;
            }
            ArrayList<Long> list = trial_division(n);
            Set<Long> set = new HashSet<>(list);

            ArrayList<Long> list2 = new ArrayList<>(set);

            Collections.sort(list2);

            for (Long aLong : list2) {
                int count = Collections.frequency(list, aLong);
                System.out.print(aLong + "^" + count + " ");

            }
            System.out.println();
        }
    }

    public static ArrayList<Long> trial_division(Long n) {

        ArrayList<Long> factorization = new ArrayList<>();

        for (long d = 2; d * d <= n; d++) {
            while (n % d == 0) {
                factorization.add(d);
                n /= d;
            }
        }
        if (n > 1)
            factorization.add(n);

        return factorization;
    }
}
