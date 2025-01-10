import java.util.Scanner;

public class StoreAndSumNumbers {

    public static void main(String[] args) {
	
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 double elements
        double[] numbers = new double[10];

        // Initialize total and index variables
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input and store it in the array
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;

            // Break the loop if the array is full (index reaches 10)
            if (index == 10) {
                break;
            }
        }

        // Calculate the total by summing the array elements
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Print the entered numbers
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Display the total value
        System.out.println("The sum of the numbers is: " + total);

        // Close the scanner
        scanner.close();
    }
}
