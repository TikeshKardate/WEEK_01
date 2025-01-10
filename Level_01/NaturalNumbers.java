// Import the utility package
import java.util.*;

// Declaring the main class
public class NaturalNumbers {

    // The main method where the program execution begins
    public static void main(String args[]) {
        
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in); 
        
        // Reading an integer input from the user and storing it in 'num'
        int num = input.nextInt();
        
        // Initialize a String variable 'ans' with the value "No"
        String ans = "No";
        
        // Checking if the number is greater than 0 to determine if it's a natural number
        if (num > 0)
		
            // If 'num' is a natural number, assign "True" to 'ans'
            ans = "True";
        
        // Calculating the sum of natural numbers from 1 to 'num'
        int sum = (num * (num + 1)) / 2;
        
        // Printing the sum if 'num' is a natural number; otherwise, printing that the number is not a natural number
        if (ans == "True")
		
            System.out.println("The sum of " + num + " natural numbers is: " + sum);
			
        else 
            
			//Displays whether the given number is natural number 
            System.out.println("The number " + num + " is not a natural number");
    }
}
