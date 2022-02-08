
import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean flag = false;

        while (in.hasNext()) {
            BigInteger n = in.nextBigInteger();
            if (flag) {
                System.out.println();
            }
            flag = true;
            if (leapYear(n)) {
                System.out.println("This is leap year.");
                if (n.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
                    System.out.println("This is huluculu festival year.");
                }

                if (n.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO) && leapYear(n)) {
                    System.out.println("This is bulukulu festival year.");
                }
            } else if (n.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
                System.out.println("This is huluculu festival year.");
            } else {
                System.out.println("This is an ordinary year.");
            }


        }

    }

    public static boolean leapYear(BigInteger n) {
        if (n.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
            if (n.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO)) {
                return n.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

