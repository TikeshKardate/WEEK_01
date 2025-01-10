// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named FahrenheitToCelsius
public class FahrenheitToCelsius {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        
        // Takes the double value entered by the user and store it in the variable fahrenheit
        double fahrenheit = sc.nextDouble();
        
        // Convert the temperature from Fahrenheit to Celsius using the formula
        double celsiusResult = ((fahrenheit-32) * 5/9);
        
        // Display the temperature in Celsius
        System.out.println(" The " + fahrenheit+ " fahrenheit is " + celsiusResult+ " celsius ");
    }
}
