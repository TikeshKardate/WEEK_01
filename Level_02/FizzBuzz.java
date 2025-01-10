//Import the utility package 
import java.util.*;

  // A class FizzBuzz is defined 
  public class FizzBuzz{ 
  
    //Main method is the starting of the program 
    public static void main(String args[]){
		
	//	Scanner object is created to take the input from the user
	Scanner input = new Scanner(System.in);
	
	System.out.println("Ennter the number: ");
	int num=input.nextInt();
	
	 for(int i=0;i<=num;i++){
	    if(i%3 ==0 && i%5!=0) 	System.out.println(i + " Fizz");
		else if(i%3 !=0 && i%5==0) 	System.out.println(i + " Buzz");
        else if(i%3 ==0 && i%5==0) 	System.out.println(i + " FizzBuzz"); 
	 }
  }
 }