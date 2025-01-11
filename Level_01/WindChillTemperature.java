// Import the utility package
import java.util.Scanner;

// Class declaration
public class WindChillTemperature {

    // Method to calculate wind chill based on temperature and wind speed
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula as per the given inputs
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * (Math.pow(windSpeed, 0.16)); 
        return windChill;  // Returning the wind chill value
    }

    public static void main(String[] args) {

        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input temperature and wind speed 
        System.out.println("Enter Temperature and Windspeed to calculate Windchill: ");
        
        // Reading temperature input from the user
        double temperature = sc.nextDouble();
        
        // Reading wind speed input from the user
        double windSpeed = sc.nextDouble();  

        // Calling method to display result
        System.out.println("Wind Chill is: " + calculateWindChill(temperature, windSpeed));

        // Closing the scanner object 
        sc.close();
    }
}

