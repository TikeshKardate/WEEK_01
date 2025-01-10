import java.util.Scanner;

public class NumberFactors {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Initialize maximum factor array size
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop through numbers from 1 to the input number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
			
                if (index == maxFactor) {
				
                    // Double the size of the factors array if maxFactor is reached
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
					
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
