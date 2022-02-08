


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str3 = in.nextLine();


        char[] arr1 = (str1 + str2).toCharArray();

        Arrays.sort(arr1);


        char[] arr2 = str3.toCharArray();

        Arrays.sort(arr2);

        StringBuilder repStr1 = new StringBuilder();
        StringBuilder repStr2 = new StringBuilder();


        for (char c : arr1) {
            repStr1.append(c);
        }
        for (char c : arr2) {
            repStr2.append(c);
        }


        if (repStr1.toString().equals(repStr2.toString())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
