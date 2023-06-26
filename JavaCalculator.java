//Import the Scanner module for readinbg keyboard input
import java.util.Scanner;

// Container for main
public class JavaCalculator {
  //main method declared
  public static void main(String[] args) {
    //Creating a new Scanner that can read a users input
    Scanner scanner = new Scanner(System.in);

    //Enter two integers
    System.out.print("Enter the First Number: ");
    int number1 = scanner.nextInt();
    System.out.print("Enter the Second Number: ");
    int number2 = scanner.nextInt();

    //Add operators
    System.out.println("Select a Function: ");
    System.out.println("+: Addition");
    System.out.println("-: Subtraction");
    System.out.println("*: Multiplication");
    System.out.println("/: Division");

    //Decided to use a string, instead of an int for ease of use
    System.out.print("Enter desired function: ");
    String function = scanner.next();

    //Default Result is 0
    int result = 0;

    //Add operator functions
    switch (function) {
      default:
        System.out.print("Invalid selection.");
        break;
      case "+":
        result = number1 + number2;
        break;
      case "-":
        result = number1 - number2;
        break;
      case "*":
        result = number1 * number2;
        break;
      case "/":
        result = number1 / number2;
        break;
    }
    
    //Print the result
    System.out.println("Result: " + result);
    
    //Close the scanner
    scanner.close();
  }  
}