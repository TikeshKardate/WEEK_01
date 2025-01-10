// This is the main class named Profit
public class Profit { 

    // Main method is the entry point of the program
    public static void main(String[] args) { 
	
	    // Declares and initializes cost price and selling price
        int costPrice = 129, sellingPrice = 191; 
        
		// Prints the cost price and selling price to the console
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice); 
		
		// Calculates the profit by subtracting cost price from selling price
        int profit = sellingPrice - costPrice; 
        
		// Calculates the profit percentage
        double profitPercentage = (profit * 100.0) / (costPrice * 1.0); 
        
		// Prints the profit and profit percentage to the console
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); 
    }
}
