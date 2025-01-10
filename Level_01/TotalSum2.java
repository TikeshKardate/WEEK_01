// Import java utilities package for Scanner class
import java.util.*; 

// Define the TotalSum2 class
public class TotalSum2 { 
    
    // Main method  is starting of the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in); 
        
        // Initialize num with the first user input (expected to be an integer)
        int num = input.nextInt(); 
        
        // Initialize ans to store the sum of numbers
        double ans = 0; 
        
        // Loop will continue until the user enters 0
        while (true) { 
            
            // Add the user input to ans
            ans += num; 
            
            // Read the next input from the user
            num = input.nextInt(); 
            
            // Break the loop if the user enters 0
            if (num!=0 && num >0) break; 
        }
        
        // Display the total value of numbers entered
        System.out.println("Total value: " + ans); 
        
    
    }
}
