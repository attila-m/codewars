package E04;

import java.util.ArrayList;
import java.util.List;

public class WriteNumberInExForm {

  public static void main(String[] args) {
    System.out.println(expandedForm(7310));
  }

  public static String expandedForm(int num) {
    List<String> stringList = zeroAdder(stringMaker(num));
    String expandedString = "";
    if (stringList.size() == 1) {
      return expandedString = stringList.get(0);
    } else if (stringList.size() > 1) {
      for (int i = 0; i < stringList.size(); i++) {
        expandedString += stringList.get(i);
        if (stringList.size() > i + 1) {
          expandedString += " + ";
        }
      }
    }
    return expandedString;
  }

  public static List<String> stringMaker(int num) {
    List<String> numList = new ArrayList<>();
    String s = String.valueOf(num);
    String c = "";
    for (int i = 0; i < s.length(); i++) {
      c = String.valueOf(s.charAt(i));
      numList.add(c);
    }
    return numList;
  }

  public static List<String> zeroAdder(List<String> numList) {
    List<String> listWithZeroes = new ArrayList<>();
    String s = "";
    for (int i = 0; i < numList.size(); i++) {
      s = numList.get(i);
      if (!s.equals("0")) {
        for (int j = 1; j < numList.size() - i; j++) {
          s += "0";
        }
        listWithZeroes.add(s);
      }
    }
    return listWithZeroes;
  }
}