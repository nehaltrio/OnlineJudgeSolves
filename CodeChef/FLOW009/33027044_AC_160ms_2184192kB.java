
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        int N = in.nextInt();


        for (int i = 0; i < N; i++) {
            int q = in.nextInt();
            int p = in.nextInt();
            double total = 0;
            double pertotal = 0;

            if (q>1000){
                total = p*q;
                pertotal = total*0.1;
                total = total - pertotal;
            }else {
                total = p*q;
            }

            list.add(total);
        }


        for (Double aDouble : list) {
            System.out.println(aDouble);
        }



    }
}
