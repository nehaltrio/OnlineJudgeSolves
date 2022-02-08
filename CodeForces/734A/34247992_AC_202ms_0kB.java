
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int countD = 0;
        int countA = 0;
        int n =in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='D'){
                countD++;
            }else {
                countA++;
            }
        }

        if (countA>countD){
            System.out.println("Anton");
        }else if (countD>countA){
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }

    }
}
