
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i =1;
        while (t-- > 0) {
            BigInteger a = in.nextBigInteger().abs();
            BigInteger b = in.nextBigInteger().abs();
            

            if (a.mod(b).equals(BigInteger.ZERO)) {
                System.out.println("Case " + i + ":" + " divisible");
            } else {
                System.out.println("Case " + i + ":" + " not divisible");
            }

            i++;
        }
    }
}
