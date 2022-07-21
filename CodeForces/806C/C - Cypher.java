
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
 
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
 
 
            in.nextLine();
            for (int i = 2; i < n + 2; i++) {
                String str = in.nextLine();
                String str2 = str.substring(2);
 
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == 'D') {
                        if (arr[i - 2] == 9) {
                            arr[i - 2] = 0;
                        } else {
                            arr[i - 2]++;
                        }
                    }
 
                    if (str2.charAt(j) == 'U') {
                        if (arr[i - 2] == 0) {
                            arr[i - 2] = 9;
                        } else {
                            arr[i - 2]--;
                        }
                    }
                }
 
 
            }
 
 
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
