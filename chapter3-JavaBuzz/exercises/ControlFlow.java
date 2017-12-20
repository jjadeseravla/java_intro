// what imports will you need?

// can you remember how to set up your main function?


// (assume user only ever enters integers)

// print the answer to the console
//
// public class ControlFlow {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     // String s = scan.next();
//     // int i = scan.nextInt();
//   }
// }


// find a way to read in user input
import java.util.Scanner;

 public class ControlFlow {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    // write a method that will check if a number is odd or even
    boolean isEven = (n % 2 == 0) ? true : false;
    String x = (isEven) ? "even" : "odd";
    System.out.println("Your number is " + x);
    //once finished
    reader.close();
  }
}
