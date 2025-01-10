// Importing the java utilities package to use Scanner class
import java.util.*; 

// Define the NumberSum2 class
public class NumberSum2 { 

     // Main method to execute the program
    public static void main(String args[]) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the first user input 
        int num = sc.nextInt(); 
        
        // Initialize ans to "No"
        String ans = "No"; 
        
        // Check if the number is positive
        if (num > 0) 
            // If positive, set ans to "True"
            ans = "True"; 
        
        // Store the original number
        int n = num; 
        
        // Calculate the sum using the arithmetic series formula
        int sum = (num * (num + 1)) / 2; 
        
        // Initialize sum1 to store the sum using a loop
        int sum1 = 0; 

        // Loop to calculate the sum by iterating from 1 to num
        for (int i = 1; i <= num; i++) { 
            sum1 += i; 
        } 
        
        // Check if the original number was positive (natural number)
        if (ans==("True")) { 
		
            // Verify if both sums match
            if (sum1 == sum) 
			
                System.out.println("The sum of " + n + " natural numbers is " + sum1); 
        } else { 
            System.out.println("The number " + n + " is not a natural number"); 
        }
    }
}
