//Imports the utility package 
import java.util.*;

// Define the LeapYear class
  public class LeapYear{ 
  
    //Main Method is the starting of the program 
    public static void main(String args[]){
	
	// Create a Scanner object to read user input
	Scanner input=new Scanner(System.in);
	
	//Take the input from the user for the year 
	int year=input.nextInt();
	
	// Checks for the century year
	if(year%100 ==0){
	
	// Checks If it is divisible by 400 
	 if(year%400 == 0){
	 
	  System.out.println("It is a leap Year");
	  }
	  
	  else System.out.println("It is not a leap Year");
	  }
	  
	  // it is checkig for non century year
	else{
	     if(year%4==0){
	  	   System.out.println("It is a leap Year");
		  }
		  else System.out.println("It is not a leap Year");
    }
 }
 }