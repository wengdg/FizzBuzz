/**
 * Created by Weng on 2/4/2015.
 */
public class FizzBuzz {
  public static void main(String[] args){

    for(int i = 1; i <= 100; i++){
      if(i%3 == 0 && i%5 == 0){
        System.out.printf("%d is FizzBuzz!\n", i);
      }
      else if(i%3 == 0){
        System.out.printf("%d is Fizz!\n", i);
      }
      else if(i%5 == 0){
        System.out.printf("%d is Buzz!\n", i);
      }
      else{
        System.out.printf("%d is nothing :(\n", i);
      }
    }
  }
}
