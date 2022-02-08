import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);



       char ch1 = in.next().charAt(0);
       char ch2 = in.next().charAt(0);

        int n = in.nextInt();

        Map<Character, Integer> hm = new HashMap<>();

        hm.put('<',0);
        hm.put('^',1);
        hm.put('>',2);
        hm.put('v',3);


        if (hm.containsKey(ch1)  && hm.containsKey(ch2)){
            if ((hm.get(ch1)+n%4)%4 == hm.get(ch2) && (hm.get(ch2)+n%4)%4 == hm.get(ch1)){
                System.out.println("undefined");
            }else if((hm.get(ch1)+n%4)%4 == hm.get(ch2)){
                System.out.println("cw");
            }else if ((hm.get(ch2)+n%4)%4 == hm.get(ch1)){
                System.out.println("ccw");
            }
        }

    }
}
