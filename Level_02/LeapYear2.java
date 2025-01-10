// Imports the utility package 
import java.util.*;

// Define the class LeapYear2
public class LeapYear2 { 

    // Main method is the starting point of the program 
    public static void main(String args[]) { 
        
        // Create a Scanner object to read the input from the user 
        Scanner input = new Scanner(System.in); 
        
        // Take input from the user for the year 
        int year = input.nextInt(); 

        // Check for century year as well as non-century year
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) { 
		
            // Display result if the given year is a leap year 
            System.out.println("It is a leap Year");
			
        } else { 
		
            // Display result if the given year is not a leap year 
            System.out.println("It is not a leap Year");
        }
    }
}
