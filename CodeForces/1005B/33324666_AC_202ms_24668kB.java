

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int len = Math.max(str1.length(), str2.length());


        int str1In = str1.length() - 1;
        int str2In = str2.length() - 1;

        int count = 0;

        int noMatch = 0;

        for (int i = 0; i < len; i++) {

            if (str1.charAt(str1In) == str2.charAt(str2In)) {

                count++;
                if (str1In != 0) {
                    str1In--;
                }

                if (str2In != 0) {
                    str2In--;
                }
            } else {
                noMatch++;
            }

        }


        int shortLen = Math.min(str1.length(), str2.length());

        int res = shortLen - count;

        int total = res + noMatch;



       if (noMatch == 0){
           System.out.println(len - shortLen);
       }else {
           System.out.println(total);
       }

    }
}
