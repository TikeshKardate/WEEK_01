// This is the main class named VolumeOfEarth
public class VolumeOfEarth {

    // Main method is the entry point of the program
    public static void main(String[] args) {
        
        // Declares and initializes the radius of the Earth in kilometers
        double radius = 6378;
        
        // Calculates the volume of the Earth in cubic kilometers using the formula for the volume of a sphere
        double volumeInKm = ((4.0 / 3.0) * (22.0 / 7.0) * (radius * radius * radius));
        
        // Converts the volume from cubic kilometers to cubic miles
        double volumeInM = (volumeInKm * 1.6 * 1.6 * 1.6);
        
        // Printing the volume of the Earth in both cubic kilometers and cubic miles to the console
        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm + " and in cubic miles is " + volumeInM);
    }
}
