

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            if (!set.add(str)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
