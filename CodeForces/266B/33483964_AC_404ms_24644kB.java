

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();

        in.nextLine();
        String str = in.nextLine();

        for (int i = 0; i < t; i++) {
            str = str.replaceAll("BG","GB");
        }

        System.out.println(str);
    }
}
