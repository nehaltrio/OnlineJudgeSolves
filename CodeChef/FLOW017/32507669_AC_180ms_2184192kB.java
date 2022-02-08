

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    
    int[] array = new int[size];
    
    for (int i = 0; i < size; i++) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      int result;
      int[] arr = new int[3];
      
      arr[0] = A;
      arr[1] = B;
      arr[2] = C;
      
      Arrays.sort(arr);
      
      result = arr[1];
      
      array[i] = result;
    }
  
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
    
  }
}
