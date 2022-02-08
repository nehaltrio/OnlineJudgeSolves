
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
       int D = in.nextInt();
        int X = in.nextInt();



        ArrayList<Integer> list = new ArrayList<>();
 

        int res = 0;


        for (int i = 0; i < N; i++) {


            int A = in.nextInt();
            int count = 0;
            int store = 0;
            while (store <= D) {
                list.add(store);
                store = (count * A + 1);
                count++;
            }
            res += count;

        }


        System.out.println((res-N)+X);
      


    }
}
