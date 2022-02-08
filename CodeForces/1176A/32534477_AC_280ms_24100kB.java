

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int size = in.nextInt();
    in.nextLine();
    ArrayList<Integer> List = new ArrayList<>();
    
    BigInteger Three = new BigInteger("3");
    BigInteger Four = new BigInteger("4");
    BigInteger Five = new BigInteger("5");
    
    for (int i = 0; i < size; i++) {
      
      String str = in.nextLine();
     
      BigInteger n = new BigInteger(str);
      int flag = 0;
      boolean check = true;
      
      while (!n.equals(BigInteger.ONE)) {
        if (n.remainder(BigInteger.TWO).equals(BigInteger.ZERO) || n.remainder(Three).equals(BigInteger.ZERO) || n.remainder(Five).equals(BigInteger.ZERO)) {
          if (n.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
            n = n.divide(BigInteger.TWO);
            flag++;
          }
          if (n.remainder(Three).equals(BigInteger.ZERO)) {
            n = n.multiply(BigInteger.TWO).divide(Three);
            flag++;
          }
          if (n.remainder(Five).equals(BigInteger.ZERO)) {
            n = n.multiply(Four).divide(Five);
            flag++;
          }
        } else {
          check = false;
          break;
        }
        
      }
      
      if (check) {
        List.add(flag);
      } else {
        List.add(-1);
      }
    }
  
    List.forEach(System.out::println);
    
  }
}
