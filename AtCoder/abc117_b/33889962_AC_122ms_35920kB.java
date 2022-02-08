

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            list.add(x);
        }

        Integer sum = list.stream().reduce(0, (a, b) -> a + b);

        Collections.sort(list);

        int res = sum - list.get(n-1);

        if (list.get(n-1) < res){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
