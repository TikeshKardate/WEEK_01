// Imports the Scanner class from the java.util package
import java.util.Scanner; 

// This is the main class named TotalPrice
public class TotalPrice {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the unit price
        System.out.print("Enter the price of one unit: ");
		
		// Reads the price of one unit from the user
        double unitPrice = input.nextDouble(); 

        // Prompts the user to enter the quantity
        System.out.print("Enter the quantity: ");
		
		// Reads the quantity from the user
        double quantity = input.nextDouble(); 

        // Calculates the total purchase price
        double totalPurchase = (unitPrice*quantity);

        // Displays the total purchase price
        System.out.println("The total purchase price is INR " +totalPurchase+ " if the quantity is " +quantity+ " and unit price is INR " +unitPrice);
    }
}
