

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
      

            if (str.charAt(str.length() - 1) == '0' || str.charAt(str.length() - 1) == '5') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        

    }
}
