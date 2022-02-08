

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();

        if (a%x == 0){
            System.out.println( (b/x - a/x) + 1);
        }else {
            System.out.println( b/x - a/x);
        }
    }
}
