// Imports the Scanner class from the java.util package
import java.util.*; 

// This is the main class named HeightConvertor
public class HeightConvertor {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter the Height
		System.out.println("Enter the Height in cm: ");
        
        // Takes the height in centimeters from the user
        int heightInCm = input.nextInt();
        
        // Converts height from centimeters to inches
        double heightInInch = (heightInCm * 1.0) / 2.54;
        
        // Converts height from inches to feet
        double heightInFoot = heightInInch / 12;
        
        // Prints the height in feet, and inches
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFoot + " and in inches is " + heightInInch);
    }
}
