import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        // Taking user input
        String userInput = scanner.next(); 

        // Call the user-defined method
        int lengthWithoutLengthMethod = findStringLengthWithoutUsingLength(userInput);
        System.out.println("Length (without using length() method): " + lengthWithoutLengthMethod);

        // Call the built-in length() method
        int lengthWithLengthMethod = userInput.length();
        System.out.println("Length (using length() method): " + lengthWithLengthMethod);
    }

    public static int findStringLengthWithoutUsingLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }
}
