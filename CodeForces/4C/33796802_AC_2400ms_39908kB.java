

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        ArrayList<String> list = IntStream.range(0, n).mapToObj(i -> in.nextLine()).collect(Collectors.toCollection(ArrayList::new));
        Map<String,Integer> map = new LinkedHashMap<>();

        ArrayList<String> finalList = new ArrayList<>();

        for (String str : list) {
            if (map.containsKey(str)) {
                finalList.add(str+map.get(str));
                map.put(str, map.get(str) + 1);
            } else {
                finalList.add("OK");
                map.put(str, 1);
            }
        }

      

       finalList.forEach(System.out::println);


    }
}
