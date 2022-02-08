
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            ArrayList<Integer> list = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                list.add(x);
            }


            Set<Integer> set = new HashSet<>(list);

            int count = 0;

            for (int i = 0; i < m; i++) {
                if (set.contains(in.nextInt())) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
