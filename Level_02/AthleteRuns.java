// Import the Scanner class from the java.util package
import java.util.Scanner;

// // This is the main class named AthleteRuns
public class AthleteRuns {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of side 1
        System.out.print("Enter the length of side 1: ");
		
        // Takes the double value entered by the user and store it in the variable side1
        double side1 = input.nextDouble();

        // Prompt the user to enter the length of side 2
        System.out.print("Enter the length of side 2: ");
		
        // Takes the double value entered by the user and store it in the variable side2
        double side2 = input.nextDouble();

        // Prompt the user to enter the length of side 3
        System.out.print("Enter the length of side 3: ");
		
        // Takes the double value entered by the user and store it in the variable side3
        double side3 = input.nextDouble();

        // Calculate the perimeter of triangle by adding the lengths of all three sides
        double perimeter = side1 + side2 + side3;

        // Define the total distance the athlete needs to run (5 km in meters)
        double totalDistance = 5 * 1000;

        // Calculate the number of rounds the athlete needs to run to complete the total distance
        double rounds = totalDistance / perimeter;

        // Display the total number of rounds the athlete will run
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
