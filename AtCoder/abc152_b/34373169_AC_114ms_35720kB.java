
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        String s = Integer.toString(n);
        int str = in.nextInt();
        String str2= Integer.toString(str);

        if (n>str) {
            System.out.println(str2.repeat(n));
        }else if(str>n){
            System.out.println(s.repeat(str));
        }else {
            System.out.println(s.repeat(str));
        }
    }
}
