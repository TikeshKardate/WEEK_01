// Import the Scanner class from the java.util package
import java.util.*;

// This is the main class named SwapNumbers
public class SwapNumbers {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
		
		// Takes the input from the user for the first number
        int number1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
		
		// Takes the input from the user for the second number
        int number2 = input.nextInt();

        // Displays the original values of number1 and number2
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the values of number1 and number2
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped values of number1 and number2
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
    }
}
