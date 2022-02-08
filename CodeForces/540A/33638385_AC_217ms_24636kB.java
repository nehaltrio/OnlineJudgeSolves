
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int sum1 = 0;
        int sum2 = 0;

     

        int res =  0;
        for (int i = 0; i < n; i++) {
            sum1 = Math.abs(Integer.parseInt(Character.toString(str1.charAt(i))) - Integer.parseInt(Character.toString(str2.charAt(i))));
            sum2 = 10 - sum1;

            res+=Math.min(sum1,sum2);
        }




        System.out.println(res);


    }
}
