// Import the Scanner class from the java.util package
import java.util.*;

// This is the main class named QuotientRemainder
public class QuotientRemainder {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
		
        // The integer value num1 is entered by the user
        int num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
		
        // The integer value num2 is entered by the user 
        int num2 = input.nextInt();

        // Calculate the quotient using the division operator
        int quotient = num1 / num2;

        // Calculate the remainder using the modulus operator
        int remainder = num1 % num2;

        // Display the result with the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + num1 + " and " + num2 + ".");
    }
}
