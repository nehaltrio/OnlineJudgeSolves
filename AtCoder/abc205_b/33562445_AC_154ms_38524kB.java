
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        boolean check = false;

        int x = 0;

        for (int i = 0; i < arr.length; i++) {

            x = i;

            if (x+1 == arr[i]){
                check = true;
            }else {
                check = false;
                break;
            }

        }

        if (check){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



    }
}
