// Import the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named TotalIncome
public class TotalIncome {

    // Main method is the entry point of the program
    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.println("Enter the Salary :");
        
        // Takes the salary entered by the user and store it in the variable salary
        double salary = input.nextDouble();
        
		// Prompt the user to enter the bonus
        System.out.println("Enter the Bonus :");
		
		// Takes the bonus entered by the user and store it in the variable bonus
        double bonus = input.nextDouble();
		
        // Calculate the total income by adding the salary and bonus 
        double totalIncome = salary+bonus ;
        
        // Display the Total Income of the person
        System.out.println(" The salary is INR " + salary+ " and  bonus is INR " + bonus+ ". Hence Total income is "+totalIncome);
    }
}
