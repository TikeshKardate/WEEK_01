// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named CelsiusToFahrenheit
public class CelsiusToFahrenheit {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        
        // Takes the double value entered by the user and store it in the variable celsius
        double celsius = sc.nextDouble();
        
        // Convert the temperature from Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Display the temperature in Fahrenheit
        System.out.println(" The " + celsius+ " celsius is " + fahrenheitResult+ " fahrenheit ");
    }
}
