import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RomanNumerals {
  private static int[] CONVERSION_RATES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  private static String[] PARTIALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public static void main(String[] args) {
    System.out.println(fromRoman("III"));
  }

  public static String toRoman(int n) {
    StringBuilder str = new StringBuilder();
    int carry = n;
    int[] symbolCounts = new int[PARTIALS.length];

    for (int i = 0; i < PARTIALS.length; i++) {
      symbolCounts[i] = carry / CONVERSION_RATES[i];
      carry = carry % CONVERSION_RATES[i];
    }

    for (int i = 0; i < symbolCounts.length; i++) {
      for (int j = 0; j < symbolCounts[i]; j++) {
        str.append(PARTIALS[i]);
      }
    }

    return str.toString();
  }

  
  public static int fromRoman(String romanNumeral) {
    long start =  System.currentTimeMillis();
    String doubleStr;
    // handle special cases (4, 9, 40, 90, ...)
    StringBuilder str = new StringBuilder(romanNumeral);
    ArrayList<Integer> SpecialNumbersIndex = new ArrayList<>();


    SpecialNumbersIndex.add(romanNumeral.indexOf("CM"));
    SpecialNumbersIndex.add(str.indexOf("CD"));
    SpecialNumbersIndex.add(str.indexOf("XC"));
    SpecialNumbersIndex.add(str.indexOf("XL"));
    SpecialNumbersIndex.add(str.indexOf("IX"));
    SpecialNumbersIndex.add(str.indexOf("IV"));

    // transform romanNumeral to ArrayList
    boolean doubleRomanNumber = false;
    List<String> romanSymbols = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      if (SpecialNumbersIndex.contains(i)){
        doubleStr = romanNumeral.substring(i, i+2);
        romanSymbols.add(doubleStr);
        i++;
      } else {
        romanSymbols.add(String.valueOf(str.charAt(i)));
      }
    }

    // converting the arraylist to int and return the sum of it
    int sumOfRomans = 0;

    for (int i = 0; i < romanSymbols.size(); i++) {
      for (int j = 0; j < PARTIALS.length; j++) {
        if (romanSymbols.get(i).equals(PARTIALS[j])){
          sumOfRomans += CONVERSION_RATES[j];
        }
      }
    }

    long stop = System.currentTimeMillis();
    System.out.println(stop-start);
    return sumOfRomans;
  }


}