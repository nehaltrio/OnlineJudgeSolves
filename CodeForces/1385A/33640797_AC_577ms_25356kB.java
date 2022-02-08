
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {


            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();

            ArrayList<Long> list = new ArrayList<>();

            list.add(x);
            list.add(y);
            list.add(z);

            Collections.sort(list);

            if (!list.get(1).equals(list.get(2))){
                System.out.println("NO");
            }else {
                System.out.println("YES");
                System.out.println(list.get(0)+" "+list.get(0)+" "+list.get(2));
            }


        }


    }
}
