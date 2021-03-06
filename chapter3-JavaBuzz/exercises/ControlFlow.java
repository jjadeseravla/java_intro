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
import java.util.Scanner; // this is a library you need to put putside to use certian methods, nothing needs to be done on command line apart from compile and execute.

 public class ControlFlow {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");

    int n = reader.nextInt(); // Scans the next token of the input as an int.
    // write a method that will check if a number is odd or even
    while ((n = reader.nextInt()) != 17) {
      boolean isEven = (n % 2 == 0) ? true : false;
      String x = (isEven) ? "even" : "odd";
      System.out.println("Your number is " + x);
      System.out.println("Input another number");
    }
    System.out.println("You broke the loop");
    //once finished
  //  reader.close();
  }
}
