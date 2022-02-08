import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arrSize = in.nextInt();
    int[] arr = new int[arrSize];
    int flagEven = 0;
    int flagOdd = 0;
    for (int i = 0; i < arrSize; i++) {
      arr[i] = in.nextInt();
    }
    int storeIndexEven = 0;
    int storeIndexOdd = 0;
    for (int i = 0; i < arrSize; i++) {
      if (arr[i] % 2 == 0) {
        storeIndexEven = i;
        flagEven++;
      }
      if (arr[i] % 2 != 0) {
        storeIndexOdd = i;
        flagOdd++;
      }
    }
    if (flagEven > flagOdd) {
      System.out.println(storeIndexOdd + 1);
    } else {
      System.out.println(storeIndexEven + 1);
    }
  }
}
