// Imports the Scanner class from the java.util package
import java.util.Scanner; 

// This is the main class named Distance2
public class Distance2 {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
		
		// Reads the distance in feet from the user
        double distanceInFeet = input.nextDouble(); 

        // Converts the distance from feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Converts the distance from yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Displays the results in yards and miles
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for the given " + distanceInFeet + " feet.");
    }
}

