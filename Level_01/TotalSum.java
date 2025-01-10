 // Import java utilities package for Scanner class
 import java.util.*;

// Define the TotalSum class
public class TotalSum {
    
    // Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Initialize num with the first user input (expected to be an integer)
        int num = sc.nextInt(); 
       
        // Initialize ans to store the sum of numbers
        double ans = 0; 
        
        // Loop will continue until the user enters 0
        while (num != 0) { 
            
            // Add the user input to ans
            ans += num; 
            
            // Read the next input from the user
            num = sc.nextInt(); 
        }
        
        // Display the total value of numbers entered
        System.out.println("Total value: " + ans); 
        
    }
}
