

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int size = in.nextInt();
    int[] arr = new int[size];
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    
    int[] arrCopy = new int[size];
    
    System.arraycopy(arr, 0, arrCopy, 0, size);
    
    Arrays.sort(arrCopy);
    
    ArrayList<Integer> Pos = new ArrayList<>();
    
    for (int i = 0; i < size; i++) {
      if (arr[i] != arrCopy[i]) {
        Pos.add(i);
      }
    }
    
    if (Pos.size()==2){
      System.out.println("YES");
    }else if (Pos.size() == 0){
      System.out.println("YES");
    }else {
      System.out.println("NO");
    }
    
    
  }
}
