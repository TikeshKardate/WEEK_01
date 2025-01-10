// Imports the Scanner class from the java.util package
import java.util.Scanner; 

// This is the main class named Handshakes
public class Handshakes {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the number of students
        System.out.print("Enter the number of Students: ");
		
		// Reads the number of students from the user
        double n = input.nextDouble(); 


        // Calculates the number of handshakes
        double handshakes = (n*(n-1))/2;

        // Displays the total number of handshakes
        System.out.println("The total number of possible handshakes is " +handshakes);
    }
}
