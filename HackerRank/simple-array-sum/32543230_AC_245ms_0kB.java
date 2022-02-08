

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int len = in.nextInt();
    int sum = 0;
    
    int[] arr = new int[len];
  
    for (int i = 0; i < len; i++) {
      arr[i] = in.nextInt();
      sum+=arr[i];
    }
  
    System.out.println(sum);
    
  }
}
