
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int pearl = 0;
        int link = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                pearl++;
            } else {
                link++;
            }
        }

        if (pearl != 0) {
            if (link % pearl == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        } else {
            System.out.println("YES");
        }

    }
}
