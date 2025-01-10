// Import the Scanner class from the java.util package
import java.util.*;

// This is the main class named SimpleInterest
public class SimpleInterest {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.println("Principal:");
		
        // Read the double value entered by the user and store it in the variable p
        double p = input.nextDouble();
        
		
        // Prompt the user to enter the rate of interest
        System.out.println("Rate:");
		
        // Read the double value entered by the user and store it in the variable r
        double r = input.nextDouble();
        
		
        // Prompt the user to enter the time period in years
        System.out.println("Time:");
		
        // Read the double value entered by the user and store it in the variable t
        double t = input.nextDouble();
		
    
        // Calculate the simple interest using the formula (P * R * T) / 100
        double si = ((p * r * t) / 100);
        
        // Display the calculated simple interest
        System.out.println("The Simple Interest is " + si+ " for Principal "+p+ ", Rate of  Interest "+r+ " and Time "+t);
    }
}
