

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    int x2 = in.nextInt();
    int y2 = in.nextInt();
    
    int pos1 = Math.abs(x1-x2);
    int pos2 = Math.abs(y1-y2);
    
    if (pos1 == pos2){
      System.out.println(pos1);
    }else System.out.println(Math.max(pos1, pos2));
 
  }
}
