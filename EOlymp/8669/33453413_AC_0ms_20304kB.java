
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i <=N ; i++) {
            if (N%i==0){
                list.add(i);
                if (i!=N/i){
                    list.add(N/i);
                }
            }
        }

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
