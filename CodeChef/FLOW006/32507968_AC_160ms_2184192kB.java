

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> resultList = new ArrayList<>();
    
    for (int i = 0; i < size; i++) {
      int num = in.nextInt();
      int result = 0;
      
      String numStr = Integer.toString(num);
      
      for (int j = 0; j < numStr.length(); j++) {
        result += Integer.parseInt(Character.toString(numStr.charAt(j)));
      }
      
      resultList.add(result);
    }
    
    for (Integer integer : resultList) {
      System.out.println(integer);
    }
    
  }
}
