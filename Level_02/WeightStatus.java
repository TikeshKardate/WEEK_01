//import the utility package 
import java.util.*;

// A class is created 
public class WeightStatus {
	
	//Main method is the starting point of the program 
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in); 
		
        double weight = input.nextDouble();
        double heightCm = input.nextDouble();
		
        double heightM = heightCm/100; 
        double bmi = weight / (heightM * heightM); 
		
        if (bmi <= 18.4) {
            System.out.println("Underweight");
			
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("StatNormal");
        } 
		else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } 
		else {
            System.out.println(" Obese");
        }

    }
}