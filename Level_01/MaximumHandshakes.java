// Importing the utility package
import java.util.*;

public class MaximumHandshakes {

    // Method to calculate the total number of handshakes
    public static int handShakes(int students) {

        // Formula for calculating handshakes
        int totalShakes = (students * (students - 1)) / 2;

        return totalShakes;
    }

    // Main method
    public static void main(String[] args) {
        
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of students
        System.out.println("Enter number of students to calculate number of handshakes");
        int students = sc.nextInt();

        // Printing the total number of handshakes
        System.out.println("Total handshakes: " + handShakes(students));

        // Closing the Scanner object
        sc.close();
    }
}

