// Import the utility package 
import java.util.*;

// Declare the main class
public class CheckNumber { 

    // The main method where the program execution begins
    public static void main(String args[]) {
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Reading an integer input from the user and storing it in 'num'
        int num = sc.nextInt();
        
        // Checking if the number is negative, zero, or positive
        if (num < 0) {
		
            // If the number is less than 0, print "Negative"
            System.out.println("Negative");
        } 
		
		else if (num == 0) {
            // If the number is equal to 0, print "Zero"
            System.out.println("Zero");
        } 
		
		else if (num > 0) {
            // If the number is greater than 0, print "Positive"
            System.out.println("Positive");
			
        }
    }
}
