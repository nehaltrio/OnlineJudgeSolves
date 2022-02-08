
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int res = 0;

        for (int i = 0; i <= N; i++) {
            int sum = getSumOfDigits(i);

            if (sum >= A && sum <= B) {
                res += i;
            }

        }

        System.out.println(res);


    }

    public static int getSumOfDigits(int n) {
        int m, sum = 0;
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }

        return sum;
    }


}
