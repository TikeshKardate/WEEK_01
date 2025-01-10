// Import the Scanner class 
import java.util.Scanner;  

// Declaring the main class 
public class RocketLaunch { 

    // The main method where the program execution begins
    public static void main(String[] args) { 

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);  
        
        //Takes the user to enter the countdown starting value
        System.out.println("Enter the countdown starting value:");  
        
        // Tajkes the integer input and store it in the variable 'counter'
        int counter = sc.nextInt();  
        
        // Using a while loop to perform the countdown
        while (counter >= 1) {  
		
            // Printing the current value of 'counter'
            System.out.println(counter);  
            
            // Decrementing the value of 'counter' by 1
            counter--;  
        }
        
        // Printing the final message after the countdown ends
        System.out.println("Liftoff!");  
    }
}
