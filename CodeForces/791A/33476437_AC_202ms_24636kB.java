

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int mW = 0;
        int nW = 0;
        int count = 0;

        for (int i = 0; i < m; i++) {
            if (m<=n){
                m = m*3;
                n = n*2;
                count++;
            }
        }

        System.out.println(count);

    }
}
