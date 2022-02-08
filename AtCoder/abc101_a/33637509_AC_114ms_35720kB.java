
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='+'){
                res++;
            }else {
                res--;
            }
        }
        System.out.println(res);
    }
}
