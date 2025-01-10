// Import the utility package 
import java.util.*;

// Declaring the main class 
public class LargestNum { 


    // The main method where the program execution begins
    public static void main(String args[]) { 
        
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Takes three integer inputs from the user
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        // Initializing String variables 'ans1', 'ans2', and 'ans3' with the value "No"
        String ans1 = "No";
        String ans2 = "No";
        String ans3 = "No";
        
        // Checking if the first number is the greatest
        if (num1 > num2 && num1 > num3) {
		
            ans1 = "True";
        }
        
        // Checking if the second number is the greatest
        if (num2 > num1 && num2 > num3) {
		
            ans2 = "True";
        }
        
        // Checking if the third number is the greatest
        if (num3 > num1 && num3 > num2) {
		
            ans3 = "True";
        }
        
        // Printing the results for each number
        System.out.println("Is the first number the greatest? " + ans1);
        System.out.println("Is the second number the greatest? " + ans2);
        System.out.println("Is the third number the greatest? " + ans3); 
    }
}
