//Imports the utility package 
import java.util.Scanner;

// A class is defined here
public class VotingEligibility {

    //Main method is the starting of the program 
    public static void main(String[] args) {
	
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Take user input for the ages of 10 students
        for (int i = 0; i < studentAges.length; i++) {
		
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        // Check each student's voting eligibility
        for (int age : studentAges) {
		
            if (age < 0) {
                System.out.println("Invalid age.");
				
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
				
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        
    }
}
