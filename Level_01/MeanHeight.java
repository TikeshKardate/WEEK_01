import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {
	
        // Create a Scanner object for receiving user input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the heights of 11 players
        double[] heights = new double[11];

        // Take user input for the heights of 11 players
        for (int i = 0; i < heights.length; i++) {
		
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate the sum of all the heights
        double sum = 0.0;
		
        for (double height : heights) {
            sum += height;
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Print the mean height
        System.out.println("The mean height of the football team is: " + meanHeight);

        // Close the scanner
        scanner.close();
    }
}
