// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named IntOperation
public class IntOperation {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number (c): ");
        int c = input.nextInt();

        // Calculate the results of the operations
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        int result2 = a * b + c; // Multiplication has higher precedence than addition
        int result3 = c + a / b; // Division has higher precedence than addition
        int result4 = a % b + c; // Modulus has the same precedence as division and higher than addition

        // Display the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
