// Import the Scanner class from the java.util package
import java.util.*;

// This is the main class named ChocolatesDistribution
public class ChocolatesDistribution {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
		
		// Prompts the user to input the number of chocolates
        System.out.println(" Enter the total number of Chocolates: " );
        
        // Takes the input by the user for the total number of chocolates
        int numberOfChocolates = input.nextInt();
		
		// Prompts the user to input the number of children
        System.out.println(" Enter the total number of Children: " );
        
        // Takes the input by the user for the total number of children
        int numberOfChildren = input.nextInt();
        
        // Calculates the number of chocolates each children gets
        int gets = numberOfChocolates / numberOfChildren;
        
        // Calculates the remaining chocolates that are not distributed
        int rem = numberOfChocolates % numberOfChildren;
        
        // Prints the number of chocolates per children and the remaining chocolates to the console
        System.out.println("The number of chocolates each child gets is " + gets+ " and the number of remaining chocolates are " + rem);
    }
}
