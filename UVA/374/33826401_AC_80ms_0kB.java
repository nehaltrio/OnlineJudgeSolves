

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Long B = in.nextLong();
            Long P = in.nextLong();
            Long M = in.nextLong();

            Long res = (power_mod_iterative(B, P, M));

            System.out.println(res);
        }

    }

    public static Long power_mod_iterative(Long base, Long exponent, Long modulus) {
        Long result = 1L;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }
        return result;
    }


}
