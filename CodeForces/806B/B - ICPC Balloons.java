
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
 
 
            int flag = 0;
            int count = 0;
 
            int distinct = 0;
 
            while (str.length() > 0) {
 
                for (int j = 0; j < str.length(); j++) {
 
                    if (str.charAt(0) == str.charAt(j)) {
                        distinct++;
 
                    }
                }
 
                count += distinct;
                String d = String.valueOf(str.charAt(0)).trim();
                str = str.replaceAll(d, "");
                distinct = 0;
 
 
                flag++;
            }
 
            int res = (flag * 2) + (count - flag);
            System.out.println(res);
        }
    }
}
