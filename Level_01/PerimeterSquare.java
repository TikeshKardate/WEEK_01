// Imports the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named PerimeterSquare
public class PerimeterSquare {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
		
		// Reads the perimeter from the user
        double perimeter = input.nextDouble(); 

        // Calculates the side of the square from the perimeter
        double side = (perimeter/4.0);

        // Displays the result
        System.out.println("Side of the square is = " + side);
    }
}
