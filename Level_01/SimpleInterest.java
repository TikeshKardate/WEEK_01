// Importing necessary libraries
import java.util.*;

// Class declaration
public class SimpleInterest {

    // Method to calculate simple interest
    public static double simpleInterestCalculation(double principal, double rate, double time) {
        // Formula for simple interest
        double interest = (principal * rate * time) / 100;
        return interest; // Return the calculated interest
    }

    // Main method
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input principal, rate, and time
        System.out.println("Enter principal, rate and time (in years)");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        // Printing the calculated simple interest along with input details
        System.out.println("The Simple Interest is " + 
            simpleInterestCalculation(principal, rate, time) + 
            " for Principal " + principal + 
            ", Rate of Interest " + rate + 
            " and Time " + time);

        // Closing the Scanner object
        sc.close();
    }
}
