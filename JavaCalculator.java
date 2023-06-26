//Import the Scanner module for readinbg keyboard input
import java.util.Scanner;

// Container for main
public class JavaCalculator {
  //main method declared
  public static void main(String[] args) {
    //Creating a new Scanner that can read a users input
    Scanner scanner = new Scanner(system.in);

    //Enter two integers
    system.out.print("Enter the First Number: ");
    int number1 = scanner.nextInt();
    system.out.print("Enter the Second Number: ");
    int number2 = scanner.nextInt();

    //Go to sleep, then add operators
    System.out.println("Select a Number Function: ");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");

    System.out.print("Enter your functions number: ");
    int choice = scanner.nextInt();

    //Add operator functions

    //Add basic error catching
    
    //Close the scanner
    scanner.close();
  }  
}
