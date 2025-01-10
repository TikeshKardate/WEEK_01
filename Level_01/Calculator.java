 // Imports the Scanner class from the java.util package
 import java.util.*;

// This is the main class named Calculator
public class Calculator {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter the first number
        System.out.println("Enter the first number: ");
		
		// Reads the first number from the user
        double number1 = input.nextDouble(); 
        
        // Prompts the user to enter the second number
        System.out.println("Enter the second number: ");
		
		// Reads the second number from the user
        double number2 = input.nextDouble(); 
        
        // Performs addition
        double addition = number1 + number2;
        
        // Performs subtraction
        double subtraction = number1 - number2;
        
        // Performs multiplication
        double multiplication = number1 * number2;
        
        // Performs division
        double division = number1 / number2;
        
        // Prints the results to the console
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}

