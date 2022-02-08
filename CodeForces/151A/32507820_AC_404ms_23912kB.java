

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int n = in.nextInt();
    int k = in.nextInt();
    int l = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int p = in.nextInt();
    int nl = in.nextInt();
    int np = in.nextInt();
    
    int drink, lime, salt;
    
    drink = (k * l) / nl;
    lime = c * d;
    salt = p / np;
    
    int[] arr = new int[3];
    arr[0] = drink;
    arr[1] = lime;
    arr[2] = salt;
    Arrays.sort(arr);
    int toast;
    toast = arr[0] / n;
    System.out.println(toast);
  }
}
