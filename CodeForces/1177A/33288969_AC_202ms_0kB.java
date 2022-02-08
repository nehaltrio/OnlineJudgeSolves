

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= k; i++) {

           builder.append(i);

        }

        System.out.println(builder.charAt(k-1));



    }
}
