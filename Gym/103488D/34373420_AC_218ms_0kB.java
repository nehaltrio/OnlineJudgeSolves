
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt()+3;
            in.nextLine();
            String str = in.nextLine()+"   ";
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i+1 == n || i +2 ==n || i+3==n){
                    break;
                }
                if (str.charAt(i) == 'y' && str.charAt(i + 1) == 'b' && str.charAt(i + 2) == 'b') {
                    count++;
                    int x = i + 3;
                    while (str.charAt(x) == 'b') {
                        count++;
                        x++;
                        if (x == n) {
                            break;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
