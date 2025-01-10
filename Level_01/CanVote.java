// Import the utility package which includes the Scanner class
import java.util.*;

// Declaring the main class 
public class CanVote { 

    // The main method where the program execution begins
    public static void main(String args[]) { 
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Reading an integer input from the user and storing it in 'age'
        int age = sc.nextInt();
        
        // Initializing a String variable 'ans' with the value "No"
        String ans = "No";
        
        // Checking if the age is equal to or greater than 18 
        // If the age is equal to or greater than 18, assign "True" to 'ans'
        if (age >= 18)
            ans = "True";
        
        // Printing the result based on the value of 'ans'
        if (ans == "True")
		
		//Displays the result for vote eligibility
		
            System.out.println("The person's age is " + age + " and can vote.");
        else
            System.out.println("The person's age is " + age + " and cannot vote.");
    }
}
