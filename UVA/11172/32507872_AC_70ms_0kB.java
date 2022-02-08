

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int x, y;
    int size = in.nextInt();
  
    ArrayList<String> symbol = new ArrayList<>();
    
    for (int i = 0; i < size; i++) {
      x = in.nextInt();
      y = in.nextInt();
      if (x > y) {
        symbol.add(">");
      } else if (x < y) {
        symbol.add("<");
      } else {
        symbol.add("=");
      }
    }
  
    for (String s : symbol) {
      System.out.println(s);
    }
    
    
  }
}
