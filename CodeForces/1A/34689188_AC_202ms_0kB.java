
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n =in.nextInt();
        long m =in.nextInt();
        long a =in.nextInt();

        long res1 = 0, res2 =0;

        if (n%a==0){
            res1 = n/a;
        }else {
            res1 = (n/a) + 1;
        }

        if (m%a==0){
            res2 = m/a;
        }else {
            res2 = (m/a) + 1;
        }

        System.out.println(res1*res2);
    }
}
