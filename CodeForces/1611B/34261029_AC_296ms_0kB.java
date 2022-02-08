import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();


            int min = Math.min(a, b);
            System.out.println(Math.min((a + b) / 4, min));
            
        }
    }
}
