import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
 
        String str;
 
        input.nextLine();
        for (int i = 0; i < n; i++) {
            str = input.nextLine();
            if (str.equalsIgnoreCase("yes")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
