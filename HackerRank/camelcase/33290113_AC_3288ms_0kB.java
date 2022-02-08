

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }

        System.out.println(count+1);


    }
}
