// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named DoubleOpt
public class DoubleOpt {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (a): ");
		
		//Takes the input for first number from user
        double a = input.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (b): ");
		
		//Takes the input for second number from user
        double b = input.nextDouble();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number (c): ");
		
		//Takes the input for third number from user
        double c = input.nextDouble();

        // Calculate the results of the operations
        double result1 = a + b * c; // Multiplication has higher precedence than addition
        double result2 = a * b + c; // Multiplication has higher precedence than addition
        double result3 = c + a / b; // Division has higher precedence than addition
        double result4 = a % b + c; // Modulus has the same precedence as division and higher than addition

        // Display the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
