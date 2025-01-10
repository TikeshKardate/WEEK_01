import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number to get its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];

        // Run a loop from 1 to 10 and store the results in the multiplication table array
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the result from the array in the format "number * i = ___"
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
