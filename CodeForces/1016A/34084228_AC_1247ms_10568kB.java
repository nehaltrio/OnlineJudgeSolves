
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            list.add(x);
        }

        int res = 0;

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res += list.get(i);

            list1.add(res / m);
            res %= m;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }

    }
}
