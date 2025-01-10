// Importing the java utilities package 
import java.util.*; 

// Define the Table class
public class Table { 
    
	// Main method to execute the program
    public static void main(String args[]) { 
	
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the user input (expected to be an integer)
        int num = sc.nextInt(); 

        // Calculate and print the multiplication table for the input number
        for (int i = 6; i <= 9; i++) { 
		
            System.out.println(num + " * " + i + " = " + num * i); 
        }
    }
}
