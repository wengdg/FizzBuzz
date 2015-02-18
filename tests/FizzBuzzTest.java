import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testing done for FizzBuzz class.
 */
public class FizzBuzzTest {

  /**
   * Test makeFizzBuzz algorithm, testing Fizz, Buzz, FizzBuzz, and number.
   *
   * @throws Exception If an error occurs.
   */
  @Test
  public void testMakeFizzBuzz() throws Exception {
    assertEquals("checking Fizz", "Fizz", FizzBuzz.makeFizzBuzz(3));
    assertEquals("checking Buzz", "Buzz", FizzBuzz.makeFizzBuzz(5));
    assertEquals("checking FizzBuzz", "FizzBuzz", FizzBuzz.makeFizzBuzz(15));
    assertEquals("checking non-Fizz/Buzz number", "7", FizzBuzz.makeFizzBuzz(7));
  }
}