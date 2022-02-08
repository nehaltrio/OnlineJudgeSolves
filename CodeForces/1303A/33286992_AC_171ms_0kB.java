

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < N; j++) {
            String str =in.nextLine();

            int count = 0;

            for (int i = str.indexOf('1'); i < str.lastIndexOf('1'); i++) {

                if (str.charAt(i) == '0'){
                    count++;
                }
            }
            list.add(count);
        }

        for (Integer integer : list) {
            System.out.println(integer);

        }
    }
}
