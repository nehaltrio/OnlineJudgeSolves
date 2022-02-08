

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        ArrayList<Integer> listDec = new ArrayList<>();
        ArrayList<Integer> listHex = new ArrayList<>();

        for (int j = 0; j < N; j++) {


            int num = in.nextInt();
            int flagDec = 0;
            int flagHex = 0;

            String DecToBin = Integer.toBinaryString(num);

            String HexToBin = Integer.toBinaryString(Integer.parseInt(Integer.toString(num), 16));

            for (int i = 0; i < DecToBin.length(); i++) {
                if (DecToBin.charAt(i) == '1') {
                    flagDec++;
                }

            }

            for (int i = 0; i < HexToBin.length(); i++) {
                if (HexToBin.charAt(i) == '1') {
                    flagHex++;
                }
            }


            listDec.add(flagDec);
            listHex.add(flagHex);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(listDec.get(i) + " " + listHex.get(i));
        }

    }
}
