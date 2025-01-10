// Importing the java utilities package
import java.util.*; 

// Define the Factorial2 class
public class Factorial2 { 
    
	// Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the first user input (expected to be an integer)
        int num = sc.nextInt(); 
        
        // Initialize ans to 1 (since 1 is the multiplicative identity)
        int ans = 1; 

        // Loop to calculate the factorial
        for( int i=1;i<=num;i++) { 
		
		    // Multiply ans by num
            ans *= i; 
			
        }

        // Display the factorial of the 'num'
         System.out.println("The  factorial of number " + num + " is "+ans); 
    }
}
