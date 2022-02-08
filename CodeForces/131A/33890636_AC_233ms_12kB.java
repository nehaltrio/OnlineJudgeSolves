
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str =  in.nextLine();
        String UpStr = str.toUpperCase();
        String strLow = str.toLowerCase();

        if (str.equals(UpStr)){
            System.out.println(strLow);
        }else  if(str.substring(1).equals(UpStr.substring(1))){
            char ch =  str.toUpperCase().charAt(0);
            String res = ch + strLow.substring(1);
            System.out.println(res);
        }else {
            System.out.println(str);
        }

    }
}
