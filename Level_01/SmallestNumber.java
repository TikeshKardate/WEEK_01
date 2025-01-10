// Import the utility package which has the Scanner class
import java.util.*;

// Declaring the main class named 'SmallestNumber'
public class SmallestNumber { 

    // The main method where the program execution begins
    public static void main(String args[]) { 
        
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // takes three integer inputs from the user and stores them in variables 'num1', 'num2', and 'num3'
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        // Initializing a String variable 'ans' with the value "Yes"
        String ans = "Yes";
        
        // Checking if the first number is smaller than both the second and third numbers
        if (num1 < num2 && num1 < num3)
            // If 'num1' is the smallest, assign "Yes" to 'ans'
            ans = "Yes";
        else
            // If 'num1' is not the smallest, assign "No" to 'ans'
            ans = "No";
        
        // Printing the result
        System.out.println("Is the first number the smallest? " + ans);
    }
}
