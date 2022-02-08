
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int s = 0;

            int i = 0;

            int sum = 0;
            int count = 0;

            ArrayList<Integer> list = new ArrayList<>();

            while (n != 0) {
                sum = n % 10;
                n = n / 10;
                s = (int) (sum * Math.pow(10, i));
                if (s != 0) {
                    list.add(s);
                }
                i++;
                if (sum != 0) {
                    count++;
                }

            }
            System.out.println(count);
            list.stream().map(integer -> integer + " ").forEachOrdered(System.out::print);
            System.out.println();
        }
    }
}
