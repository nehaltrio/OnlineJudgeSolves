
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int flag = 0;
        String[] arr = new String[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                flag++;
            }
        }

        System.out.println(flag);

    }
}
