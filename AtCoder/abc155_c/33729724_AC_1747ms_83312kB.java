
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();


        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            list.add(str);
        }

        Map<String,Integer> map = new HashMap<>();

        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }


        int max = Collections.max(map.values());

        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }

        Collections.sort(keys);

        keys.forEach(System.out::println);

    }

}
