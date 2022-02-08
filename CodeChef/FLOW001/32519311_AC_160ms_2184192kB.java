

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
  
    ArrayList<Integer> AddList = new ArrayList<>();
    int size = in.nextInt();
  
    for (int i = 0; i < size; i++) {
      int x = in.nextInt();
      int y = in.nextInt();
  
      int result ;
  
      result = x+y;
      
      AddList.add(result);
    }
  
    for (Integer integer : AddList) {
      System.out.println(integer);
    }
    
  }
}
