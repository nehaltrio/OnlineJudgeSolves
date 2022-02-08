

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
    
    int size = in.nextInt();
    int[] arr = new int[size];
    ArrayList<Integer> listEven = new ArrayList<Integer>();
    ArrayList<Integer> listOdd = new ArrayList<Integer>();
  
    for (int i = 0; i < size; i++) {
      arr[i]=in.nextInt();
    }
  
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0){
        listEven.add(arr[i]);
      }else {
        listOdd.add(arr[i]);
      }
    }
    
    if (listEven.size() < listOdd.size()){
      for (int i = 0; i < size; i++) {
        if (arr[i] % 2 == 0){
          System.out.println(i+1);
        }
      }
    }else {
      for (int i = 0; i < size; i++) {
        if (arr[i] % 2 != 0){
          System.out.println(i+1);
        }
      }
    }
    
  
  }
}
