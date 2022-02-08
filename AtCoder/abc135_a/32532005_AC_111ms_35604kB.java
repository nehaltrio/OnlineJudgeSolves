
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    
    int res = (x+y)/2;
    
    if (Math.abs(x - res) == Math.abs(y -res)){
      System.out.println(res);
    }else{
      System.out.println("IMPOSSIBLE");
    }
  
    
    
  }
}
