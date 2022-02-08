

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        StringBuilder builder = new StringBuilder(str);

        String flag = "heidi";

        char ch;
        int n = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            ch = flag.charAt(n);

            if (builder.charAt(count) == ch) {
                if (n < 4) {
                    n++;
                }
                count++;
            } else {
                builder.deleteCharAt(count);
            }
        }


        if (builder.toString().contains("heidi")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
