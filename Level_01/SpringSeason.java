// Import the utility package
import java.util.*;

 // Declare the main class 
public class SpringSeason {


    // The main method where the program execution begins
    public static void main(String args[]) { 
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Reading two integer inputs from the user: 'month' and 'day'
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        // Initializing a String variable 'ans' with the value "No"
        String ans = "No";
        
        // Checking if the date falls within the spring season (March 20th to June 20th)
        if (month == 3 && day >= 20)
		
            // If the date is on or after March 20th, set 'ans' to "Yes"
            ans = "Yes";
			
        else if (month > 3 && month < 6)
		
            // If the month is April or May, set 'ans' to "Yes"
            ans = "Yes";
			
        else if (month == 6 && day <= 20)
		
            // If the date is on or before June 20th, set 'ans' to "Yes"
            ans = "Yes";
        
        // Printing the result based on the value of 'ans'
        if (ans == "Yes")
		
            System.out.println("Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
