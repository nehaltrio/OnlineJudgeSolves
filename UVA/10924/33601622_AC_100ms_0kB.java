
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {
            String str = in.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            int val = 1;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                map.put(ch, val);
                val++;
            }

            for (char ch = 'A'; ch <= 'Z'; ch++) {
                map.put(ch, val);
                val++;
            }

            int total = 0;

            for (int i = 0; i < str.length(); i++) {

                if (map.containsKey(str.charAt(i))) {
                    total += map.get(str.charAt(i));
                }

            }


            if (prime(total)) {
                System.out.println("It is a prime word.");
            } else {
                System.out.println("It is not a prime word.");
            }
        }


    }


    public static boolean prime(int n) {
        if (n == 1) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
