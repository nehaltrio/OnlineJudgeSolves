

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String str = in.nextLine();

        int price = 700;

        if (str.charAt(0) == 'o'){
            price = price +100;
        }

        if (str.charAt(1) == 'o'){
            price = price +100;
        }

        if (str.charAt(2) == 'o'){
            price = price +100;
        }

        System.out.println(price);

    }
}
