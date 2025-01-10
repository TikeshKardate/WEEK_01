 // This is the main class named SamMarks
 public class SamMarks {
 
    // Main method is the entry point of the program
    public static void main (String[] args) { 
	
	    // Declares and initializes marks in Maths, Physics, and Chemistry
        int maths = 94, physics = 95, chemistry = 96; 
        
		// Calculates the average marks
        double average = ((maths + physics + chemistry) / 3.0); 
        
		// Prints the average marks to the console
        System.out.println("Sam's average marks in PCM is " + average); 
    }
}
