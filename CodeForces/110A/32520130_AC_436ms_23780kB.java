

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    String numStr = in.nextLine();
    
    int flag = 0;
    
    for (int i = 0; i < numStr.length(); i++) {
      if (numStr.charAt(i) == '4' || numStr.charAt(i) == '7' && numStr.charAt(i) != '0'
                                       && numStr.charAt(i) != '1'
                                       && numStr.charAt(i) != '2'
                                       && numStr.charAt(i) != '3'
                                       && numStr.charAt(i) != '5'
                                       && numStr.charAt(i) != '6'
                                       && numStr.charAt(i) != '8'
                                       && numStr.charAt(i) != '9') {
        flag++;
      }
    }
  
    if (flag == 4 || flag == 7) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
    
  }
}
