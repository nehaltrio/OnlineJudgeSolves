

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigInteger num1 = in.nextBigInteger();
            if (num1.isProbablePrime(15)) {
                StringBuilder str1 = new StringBuilder(num1.toString());
                StringBuilder str2 = str1.reverse();
                BigInteger num2 = new BigInteger(str2.toString());
                if (!num1.equals(num2)) {
                    if (num2.isProbablePrime(15))
                        System.out.println(num1 + " is emirp.");
                    else
                        System.out.println(num1 + " is prime.");
                } else
                    System.out.println(num1 + " is prime.");
            } else {
                System.out.println(num1 + " is not prime.");
            }
        }
    }
}