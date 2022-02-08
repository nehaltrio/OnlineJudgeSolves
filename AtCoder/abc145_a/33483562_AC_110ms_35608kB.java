

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();

        double ar = Math.PI;

        double ar2 = Math.PI*(Math.pow(r,2));

        int times = (int) ((int) Math.ceil(ar2/ar));

        System.out.println(times);




    }
}
