
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String noSpaceStr1 = str1.replaceAll("\\s", "");
        String str2 = in.nextLine();
        String noSpaceStr2 = str2.replaceAll("\\s", "");

        StringBuilder stringBuilder = new StringBuilder(noSpaceStr1);
        boolean check = false;

        for (int i = 0; i < noSpaceStr2.length(); i++) {
            if (stringBuilder.indexOf(String.valueOf(noSpaceStr2.charAt(i))) != -1) {
                stringBuilder.deleteCharAt(stringBuilder.indexOf(String.valueOf(noSpaceStr2.charAt(i))));
                check = true;
            }else {
                check = false;
                break;
            }
        }

        if (check){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }


}
