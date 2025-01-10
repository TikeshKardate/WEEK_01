//import the utility package 
import java.util.*;

  //Define class named GradeMarks
  public class GradeMarks{ 
  
    //Main method is the starting of the program 
    public static void main(String args[]){
		
	//Scanner object is created to take the input from the user 
	Scanner input =new Scanner(System.in);
	
	//Prompts the user to enter the marks of physics 
	System.out.println("enter marks of physics");
	//Takes the input from the user for marks of Physics 
	int physics=input.nextInt();
	
	//Prompts the user to enter the marks of chemistry 
	System.out.println("enter marks of chemistry");
	//Takes the input from the user for marks of chemistry 
	int chemistry=input.nextInt();
	
	//Prompts the user to enter the marks of maths 
	System.out.println("enter marks of maths");
	//Takes the input from the user for marks of maths 
	int maths=input.nextInt();
	
	 double marks = ((physics+chemistry+maths) *100.0)/300.0;
	 
	
	 if(marks >=80) 
	 System.out.println(" grade is A and remark is =  Level 4, above agency-normalized standards");
 
	 else if (marks>=70 && marks<80)
       	 System.out.println(" grade is B and remark is = Level 3, at agency-normalized standards");
         
          else if (marks>=60 && marks<70)
       	    System.out.println(" grade is C and remark is = Level 2, below, but approaching agency-normalized standards");
		
           else if (marks>=50 && marks<60)
       	      System.out.println("  grade is D and remark is = Level 1-, well below agency-normalized standards");
		  
			  else if(marks>=40 && marks<50)
			       System.out.println(" grade is E and remark is =  Level 1-, too below agency-normalized standards");
			   
               else
			      System.out.println(" grade is R and remark is = Remedial standards");
	  
	
    }
 }