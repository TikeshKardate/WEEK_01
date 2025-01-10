//Import the utility package 
import java.util.*;

  //A glass is created 
  public class FizzBuzz2{ 
  
    //Main method is the starting point of the program 
    public static void main(String args[]){
		
	//A scanner object is created to take the user input 
	Scanner input=new Scanner(System.in);
	
	//text input from the user 
	int num=input.nextInt();
	 int i=0;
	 while(i<=num){
	    if(i%3 ==0 && i%5!=0) 	System.out.println(i + " Fizz");
		else if(i%3 !=0 && i%5==0) 	System.out.println(i + " Buzz");
        else if(i%3 ==0 && i%5==0) 	System.out.println(i + " FizzBuzz"); 
		i++;
	 }
  }
 }