// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named WeightConversion
public class WeightConversion {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the Weight in pounds
        System.out.println("Enter the Weight in pounds:");
        
        // Takes the value of weight entered by the user and store it in the variable weightInPound
        double weightInPound = input.nextDouble();
        
        // Convert the weight from Pound to Kilograms
        double weightInKilo = (weightInPound * 2.2);
        
        // Display the weight in Kilograms
        System.out.println(" The weight of the person in pound is " + weightInPound+ " and in kg is " + weightInKilo);
    }
}
