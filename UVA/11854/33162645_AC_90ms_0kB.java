
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int[] arr = new int[3];

        ArrayList<String> list = new ArrayList<>();

        while (true){
            for (int i = 0; i < 3; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] ==0 && arr[2] ==0){
                break;
            }

            double sum = Math.pow(arr[0],2) + Math.pow(arr[1],2);
            double sum2 = Math.pow(arr[2],2);

            String str = null;
            if (sum == sum2){
                str = "right";
            }else {
                str = "wrong";
            }
            list.add(str);



        }

        for (String s : list) {
            System.out.println(s);
        }



    }
}
