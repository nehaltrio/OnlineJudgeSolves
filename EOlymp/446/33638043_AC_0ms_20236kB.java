
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n/i == n%i) {
                list.add(i);
            }
        }

        System.out.println(list.size());

    }
}
