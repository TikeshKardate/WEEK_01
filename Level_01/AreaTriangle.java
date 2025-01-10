// Imports the Scanner class from the java.util package
import java.util.Scanner;

// This is the main class named AreaTriangle
public class AreaTriangle {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Creates a new Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
		
		// Reads the base from the user
        double base = input.nextDouble(); 
        
        // Prompts the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
		
		// Reads the height from the user
        double height = input.nextDouble(); 

        // Calculates the area of the triangle
        double area = ((1.0 / 2) * base * height);

        // Displays the result
        System.out.println("Area of the Triangle is = " + area);
    }
}
