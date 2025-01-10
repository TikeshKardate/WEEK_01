// This is the main class named PensDistribution
public class PensDistribution {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Declares and initializes the total number of pens
        int pens = 14;
        
        // Declares and initializes the total number of students
        int students = 3;
        
        // Calculates the number of pens each student gets
        int d = pens / students;
        
        // Calculates the remaining pens that are not distributed
        int r = pens % students;
        
        // Prints the number of pens per student and the remaining pens to the console
        System.out.println("The Pen Per Student is " + d + " and the remaining pen not distributed is " + r);
    }
}
