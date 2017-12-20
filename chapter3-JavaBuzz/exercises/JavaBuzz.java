// can you remember how to set up your main function?

// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15

public class JavaBuzz {
  public static void main(String[] args) {
    //int n;

    for ( int n = 1; n <= 100; n++) {
      if ( n % 15 == 0){
        System.out.println("FizzBuzz");
      } else if ( n % 3 == 0) {
        System.out.println("Fizz");
      } else if ( n % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(n);
      }
    }
  }
}
