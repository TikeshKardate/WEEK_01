// Import the java utilities package 
import java.util.*; 

// Define the Bonus class
public class Bonus { 
    
	// Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the user inputs for salary and years of work
        int salary = sc.nextInt(); 
        int years = sc.nextInt(); 

        // Calculate bonus as 5% of salary
        int bonus = (salary * 5) / 100; 

        // Check if years of work are greater than 5
        if (years > 5) { 
		
            // If true, print the bonus amount
            System.out.println("The bonus amount is " + bonus); 
			
        } else { 
		
            // Otherwise, inform that years of work are less than 5
            System.out.println("Years are less than 5"); 
        }
    }
}
