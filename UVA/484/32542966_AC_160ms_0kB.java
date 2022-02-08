import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main{
  
  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter printWriter = new PrintWriter(System.out);
    
    String str;
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    
    List<Integer> key = new ArrayList<Integer>();
    
    
    while ((str = bufferedReader.readLine()) != null) {
      String[] line = str.split(" ");
      for (String s : line) {
        int val = Integer.parseInt(s);
        if (map.containsKey(val)) {
          map.put(val, map.get(val) + 1);
        } else {
          key.add(val);
          map.put(val, 1);
        }
      }
    }
    
    
    for (int i : key) {
      int val = map.get(i);
      printWriter.println(i + " " + val);
    }
    
    printWriter.flush();
    printWriter.close();
  }
}