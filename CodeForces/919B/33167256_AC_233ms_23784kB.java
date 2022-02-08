
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int flag = 0;

        int res = 19;

        while (true) {
            int sum = 0;

            int i = res;
            while (i > 0) {
                sum = sum + i % 10;
                i = i / 10;
            }

            if (sum == 10) {
                flag++;
            }
            if (flag == n) {
                break;
            }
            res += 9;
        }

        System.out.println(res);
    }
}


