// Import java utilities package for Scanner class
import java.util.*; 

// Define the NumberSum class
public class NumberSum { 

    // Main method to execute the program
    public static void main(String args[]) { 
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in); 
        
        // Read the first user input (expected to be an integer)
        int num = input.nextInt(); 
        
        // Initialize ans to "No"
        String ans = "No"; 
        
        // Check if the number is positive
        if (num > 0) 
		
            // If positive, set ans to "True"
            ans = "True"; 
        
        // Store the original n
        int n = num; 
        
        // Calculate the sum using the formula
        int sum = (num * (num + 1)) / 2; 
        
        // Initialize sum1 to store the sum 
        int sum1 = 0; 

        // Loop to calculate the sum by adding each number from num to 1
        while (num >= 1) { 
            sum1 += num; 
            num--; 
			
        }

        // Check if the original number was positive (natural number)
        if (ans==("True")) { 
		
            // Check if both calculated sums match
            if (sum1 == sum) 
			
                System.out.println("The sum of " + n + " natural numbers is " + sum); 
        } else { 
            System.out.println("The number " + n + " is not a natural number"); 
        }
    }
}
