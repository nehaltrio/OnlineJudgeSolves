
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int n;


        while (true) {

             n = in.nextInt();

             if (n==0){
                 break;
             }

             if (prime(n)){
                 System.out.println(0);
             }else {

                 int flag1 = 1;
                 int flag2 = 1;

                 int store1 = 0;
                 int store2 = 0;

                 for (int i = 0; i < n; i++) {

                     if (prime(n - flag1)) {
                         store1 = n - flag1;
                         break;
                     } else {
                         flag1++;
                     }

                 }

                 for (int i = 0; i < n; i++) {

                     if (prime(n + flag2)) {
                         store2 = n + flag2;
                         break;
                     } else {
                         flag2++;
                     }

                 }

                 System.out.println(Math.abs((store1 - store2)));
             }
        }



    }

    public static boolean prime(int n) {
        if (n == 1) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
