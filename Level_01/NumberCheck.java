import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number and print the result
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
					
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
				
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
			
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first element is less than the last element.");
			
        } else {
            System.out.println("The first element is equal to the last element.");
        }

        // Close the scanner
        scanner.close();
    }
}
