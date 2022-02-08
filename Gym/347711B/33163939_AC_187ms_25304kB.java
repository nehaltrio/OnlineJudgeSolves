

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int trip = a / b;

        if (a % b == 0) {
            System.out.println(trip);
        } else {
            System.out.println(trip + 1);
        }


    }
}
