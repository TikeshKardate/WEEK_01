//import the utility package 
import java.util.*;

  //IsPrime class is defined
  public class IsPrime{ 
    
	//Main method is the starting of the program 
    public static void main(String args[]){
	
	//Scanner object is created to take the input from the user 
	Scanner sc=new Scanner(System.in);
	
	//Take the input from the user for the num
	int num=sc.nextInt();
	
	// if number is divisible by only 1 and itself then it is prime otherwise not prime
	 boolean isprime=true;
	 
	    for(int i=2;i<num;i++){
		
		 if(num%i == 0){
		 isprime=false;
		 break;}
		}
		if(isprime)
		  System.out.println(" entered number is prime ");
		  else
		  System.out.println(" entered number is not  prime ");

  }
 }