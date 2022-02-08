
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger n = in.nextBigInteger();

            int count = 0;

            while (!n.equals(BigInteger.ONE)) {
                if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                    n = n.divide(BigInteger.valueOf(2));
                    count++;
                } else if (n.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                    n = (n.multiply(BigInteger.TWO)).divide(BigInteger.valueOf(3));
                    count++;
                } else if (n.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)) {
                    n =  (n.multiply(BigInteger.valueOf(4))).divide(BigInteger.valueOf(5));
                    count++;
                }
                else {
                    count = -1;
                    break;
                }

            }


            System.out.println(count);

        }

    }
}
