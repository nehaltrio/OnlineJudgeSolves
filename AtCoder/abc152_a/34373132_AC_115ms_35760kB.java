
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n==m){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
