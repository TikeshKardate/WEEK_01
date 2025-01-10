// Importing the java utilities package
import java.util.*; 

// Define the Factorial class
public class Factorial { 
    
	// Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the first user input (expected to be an integer)
        int num = sc.nextInt(); 
        
        // Initialize ans to 1 (since 1 is the multiplicative identity)
        int ans = 1; 

        // Loop to calculate the factorial
        while (num > 1) { 
		
		    // Multiply ans by num
            ans *= num; 
			
			// Decreasing value of num by 1
            num--; 
        }

        // Display the factorial of the 'num'
        System.out.println("The factorial of the number is " + ans); 
    }
}
