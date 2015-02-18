/**
 * FizzBuzz program
 * Created by Weng on 2/4/2015.
 */
public class FizzBuzz {

  /**
   * Run FizzBuzz algorithm on numbers 1-100.
   *
   * @param args Invalid.
   */
  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      System.out.println(makeFizzBuzz(i));
    }
  }

  /**
   * FizzBuzz algorithm which returns Fizz if i is mult of 3, Buzz if mult of 5, FizzBuzz
   * if mult of 3 and 5, and i itself if none of the above.
   *
   * @param i Target number.
   * @return Respective FizzBuzz string based on multiple.
   */
  public static String makeFizzBuzz(int i) {
    if (i % 3 == 0 && i % 5 == 0) {
      return "FizzBuzz";
    }
    else if (i % 3 == 0) {
      return "Fizz";
    }
    else if (i % 5 == 0) {
      return "Buzz";
    }
    else {
      return Integer.toString(i);
    }
  }
}
