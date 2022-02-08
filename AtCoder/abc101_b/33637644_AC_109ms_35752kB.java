
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
        }

        if (n%sum==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
