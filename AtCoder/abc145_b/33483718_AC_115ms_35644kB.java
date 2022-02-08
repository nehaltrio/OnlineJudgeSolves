
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String str = in.nextLine();

        int x = str.length() / 2;

        int count = 0;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(x+i)) {
                count++;
            }
        }


            if (count*2 == str.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


    }
}
