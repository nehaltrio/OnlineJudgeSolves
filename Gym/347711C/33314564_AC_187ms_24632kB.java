
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();


        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = new char[str1.length()];
        char[] chars2 = new  char[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            chars[i] = str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            chars2[i] = str2.charAt(i);
        }

        int i = 0;

        while (i < str1.length() || i < str2.length()) {

            if (i < str1.length()) {

                stringBuilder.append(chars[i]);
            }
            if (i < str2.length()) {
                stringBuilder.append(chars2[i]);
            }

            i++;
        }


        System.out.println(stringBuilder.toString().toLowerCase());


    }
}