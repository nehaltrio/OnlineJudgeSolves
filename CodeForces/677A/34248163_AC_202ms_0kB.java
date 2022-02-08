
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int res = 0;
        ;
        for (int i = 0; i < n; i++) {
            int y = in.nextInt();
            if (y <= x) {
                res++;
            } else {
                res += 2;
            }
        }

        System.out.println(res);

    }
}
