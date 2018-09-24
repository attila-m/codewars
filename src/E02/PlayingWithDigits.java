package E02;

public class PlayingWithDigits {

  public static void main(String[] args) {
    System.out.println(digPow(89,1));
  }

  public static long digPow(int n, int p) {
    int sum = 0;
    String s = String.valueOf(n);
    for (int i = 0; i < s.length() ; i++) {
      int num = Character.getNumericValue(s.charAt(i));
      sum += Math.pow(num,p + i);
      }
    if (sum % n == 0) {
      return sum / n;
    }
    System.out.println(sum);
    return -1;
  }
}