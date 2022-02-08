

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        ArrayList<Integer> res = new ArrayList<>();

        for (int j = 0; j < N ; j++) {

            int roomNum = in.nextInt();
            in.nextLine();
            String color = in.nextLine();

            int R = 0;
            int G = 0;
            int B = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < roomNum; i++) {
                char ch = color.charAt(i);
                if (ch == 'R') {
                    R++;
                }
                if (ch == 'G') {
                    G++;
                }
                if (ch == 'B') {
                    B++;
                }
            }

            list.add(R);
            list.add(G);
            list.add(B);

            res.add(roomNum - Collections.max(list));
        }


        for (Integer re : res) {
            System.out.println(re);
        }



    }
}
