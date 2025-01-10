// Imports the Scanner class from the java.util package
import java.util.*;

// This is the main class named FeesDiscount2
public class FeesDiscount2 {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);
        
		//Prompts the user to enter the total fees
		System.out.println("Enter the Total Fees: ");
		
        // Takes the total fees from the user
        int fees = input.nextInt();
        
		//Prompts the user to enter the University Discount
		System.out.println("Enter the University Discount: ");
		
        //Takes the discount percentage from the user
        int discountPercent = input.nextInt();
        
        // Calculates the discount amount
        int discount = (fees * discountPercent) / 100;
        
        // Calculates the final fees after discount
        int finalFees = fees - discount;
        
        // Prints the discount amount and the final discounted fee to the console
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFees);
    }
}
