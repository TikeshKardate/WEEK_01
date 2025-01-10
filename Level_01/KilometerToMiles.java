// Imports the Scanner class from the java.util package
import java.util.*;

// This is the main class named KilometerToMiles
public class KilometerToMiles {

    // Main method is the entry point of the program
    public static void main(String[] args) {
    
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);
    
        // Prompts the user to enter the distance in kilometers
        System.out.println("Enter the distance in Km: ");
    
        // Reads the distance in kilometers from the user
        double km = input.nextDouble();
        
        // Converts the distance from kilometers to miles
        double miles = (1.6 * km);
        
        // Prints the converted distance to the console
        System.out.println("The total miles is " + miles + " for the given " + km + " km");
    }
}
