
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        int d =in.nextInt();

        int r = a+b;
        int l = c+d;

        if (r>l){
            System.out.println("Left");
        }else if ((r<l)){
            System.out.println("Right");
        }else {
            System.out.println("Balanced");
        }
        
    }
}
