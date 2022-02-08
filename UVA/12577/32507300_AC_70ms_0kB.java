

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<String> strList = new ArrayList<>();
    
    String str;
    int i = 0;
    
    label:
    while (true) {
      str = in.nextLine();
      switch (str) {
        case "*":
          break label;
        case "Hajj":
          strList.add("Case "+(i+1)+":"+" Hajj-e-Akbar");
          break;
        case "Umrah":
          strList.add("Case "+(i+1)+":"+" Hajj-e-Asghar");
          break;
      }
      i++;
    }
  
    for (String s : strList) {
      System.out.println(s);
    }
  
  
  }
}
