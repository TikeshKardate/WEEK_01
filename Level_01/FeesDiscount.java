// This is the main class named FeesDiscount
public class FeesDiscount {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Declares and initializes the total fees
        int fees = 125000;
        
        // Declares and initializes the discount percentage
        int discountPercent = 10;
        
        // Calculates the discount amount
        int discount = (fees * discountPercent) / 100;
        
        // Calculates the final fees after discount
        int finalFees = fees - discount;
        
        // Prints the discount amount and the final discounted fee to the console
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFees);
    }
}
