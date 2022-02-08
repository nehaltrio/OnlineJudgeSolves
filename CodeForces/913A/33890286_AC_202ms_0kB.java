

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Long n = in.nextLong();

        Long m = in.nextLong();

        if (power(2L,n) == 0L){
            System.out.println(m);
        }else {
            System.out.println(m%power(2L, n));
        }



    }

    public static Long power(Long base, Long exponent) {
        Long result = 1L;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result =  (result * base);
            }
            base =  (base * base);
            exponent /= 2;
        }
        return result;
    }
}
