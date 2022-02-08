

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        long res = 0;
        while (s.hasNextInt()) {
           long a = s.nextLong();
           long b = s.nextLong();
           res = a^b;
            System.out.println(res);
        }


    }
}
