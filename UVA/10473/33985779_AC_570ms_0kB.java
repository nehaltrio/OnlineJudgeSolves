
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            String str = in.nextLine();
            int n =0;
            
            if (!str.contains("0x")) {
                 n = Integer.parseInt(str);
            }
            if (n < 0) {
                break;
            }

            if (str.contains("0x")) {
                String s = str.substring(2);
                int decimal =Integer.parseInt(s,16);
                System.out.println(decimal);
            } else {
                System.out.println("0x"+Integer.toHexString(n).toUpperCase());
            }
        }
    }


}
