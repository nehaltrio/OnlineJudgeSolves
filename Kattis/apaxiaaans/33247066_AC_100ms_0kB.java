

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();

        StringBuilder builder = new StringBuilder(str);
        int flag1 = 0;
        for (int i = 0; i < str.length(); i++) {
            int flag2 = flag1+1;
            if (flag2  == builder.length()){
                break;
            }
            if (builder.charAt(flag1) == builder.charAt(flag2)){
                builder.deleteCharAt(flag2);
            }else {
                flag1++;
            }
        }

        System.out.println(builder);
    }
}
