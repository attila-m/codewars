package E03;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

  public static void main(String[] args) {
    System.out.println(sumDigPow(1,100).toString());
  }

  public static List<Long> sumDigPow(long a, long b) {
    List<Long> eurekaList = new ArrayList<>();
    long sum = 0;
    long n = 0;
    String s = "";
    while (a <= b) {
       s = String.valueOf(a);
      for (int i = 0; i < s.length() ; i++) {
        n = Character.getNumericValue(s.charAt(i));
        sum += Math.pow(n, i + 1);
      }
      if (a == sum) {
        eurekaList.add(a);
      }
      a++;
      sum = 0;
    }
    return eurekaList;
  }
}
