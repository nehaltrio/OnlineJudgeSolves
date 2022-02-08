
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int len = 1,flag =1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]){
                len++;
            }else {
                flag = Math.max(flag,len);
                len = 1;
            }
        }

        System.out.println(Math.max(len,flag));
    }
}
