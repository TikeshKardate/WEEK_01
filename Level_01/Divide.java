// Imports the utility package which includes the Scanner class
import java.util.*;  

// Declare the main class named 'Divide'
public class Divide {  

    // The main method where the program execution begins
    public static void main(String args[]) {  
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);  
        
        // Reading an integer input from the user and storing it in variable 'n'
        int n = sc.nextInt();  
        
        // Initializing a String variable 'ans' with the value "Yes"
        String ans = "Yes";  
        
        // Checking if the number 'n' is divisible by 5
        if (n % 5 == 0)  
            // If 'n' is divisible by 5, assign "Yes" to 'ans'
            ans = "Yes";  
        else
            // If 'n' is not divisible by 5, assign "No" to 'ans'
            ans = "No";  
        
        // Printing the result
        System.out.println("Is the number " + n + " divisible by 5 ?  " + ans);  
    }
}
