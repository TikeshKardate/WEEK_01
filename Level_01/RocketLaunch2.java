// Importing the Scanner class to take user input
import java.util.Scanner;  

// Declaring the main class 
public class RocketLaunch2 { 

    // The main method where the program execution begins
    public static void main(String[] args) { 

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);  
        
        // Prompting the user to enter the countdown starting value
        System.out.println("Enter the countdown starting value:");  
        
        // Reading the integer input and storing it in the variable 'counter'
        int counter = sc.nextInt();  
        
        // Using a for loop to perform the countdown
        for (int i = counter; i >= 1; i--) {  
		
            // Printing the current value of 'i'
            System.out.println(i);  
			
        }
        
        // Printing the final message after the countdown ends
        System.out.println("Liftoff!");  
    }
}
