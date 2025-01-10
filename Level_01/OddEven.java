// Importing the java utilities package
import java.util.*; 

// Define the OddEven class
public class OddEven { 
    
	// Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the first user input (expected to be an integer)
        int num = sc.nextInt(); 

        // Loop to check if numbers from 1 to num are odd or even
        for (int i = 1; i <= num; i++) { 
		
		    // Check if number is even
            if (i % 2 == 0) 
			
                System.out.println("number " + i + " is Even"); 
			
            // Otherwise, the number is odd
            else 
                System.out.println("number " + i + " is Odd"); 
        }
    }
}
