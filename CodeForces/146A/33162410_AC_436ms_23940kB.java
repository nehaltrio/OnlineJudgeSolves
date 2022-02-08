

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        in.nextLine();

        String Snum = in.nextLine();

        boolean check = true;
        int FHalf = 0;
        int LHalf = 0;
        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (Snum.charAt(i) != '4' && Snum.charAt(i) != '7') {
                    check = false;
                    break;
                }

                int n  =  Integer.parseInt(Snum.charAt(i)+"");

                if (i<N/2){
                    FHalf +=n;
                }else {
                    LHalf += n;
                }
            }


                if (check && FHalf == LHalf) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }



        } else {
            System.out.println("NO");
        }


    }
}
