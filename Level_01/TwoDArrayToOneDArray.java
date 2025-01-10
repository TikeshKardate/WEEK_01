import java.util.Scanner;

public class TwoDArrayToOneDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
		
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array (matrix) based on user input
        int[][] matrix = new int[rows][columns];

        // Take user input for each element of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store elements from the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
