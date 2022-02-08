

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int flag = 0;
        int K = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            list.add(x);
        }

        for (int i = 0; i < N; i++) {
            if (list.get(i) % K == 0){
                flag++;
            }
        }

        System.out.println(flag);

    }
}
