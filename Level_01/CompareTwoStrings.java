import java.util.Scanner;
public class CompareTwoStrings {

public static boolean Compare (String s1, String s2){
if (s1.length()!=s2.length())
return false;

for (int i=0; i<s1.length(); i++){
if (s1.charAt(i)!=s2.charAt(i))
return false;
}
 
 return true;
}
 
public static void main (String [] args){
Scanner sc = new Scanner (System.in);

String str1=sc.next();
String str2=sc.next();

boolean ans1=Compare (str1,str2);
boolean ans2=str1.equals(str2);
if(ans1==ans2){
System.out.println ("The comparison from both the methods is same " );
}
else{
System.out.println ("The comparison from both the methods is same " );
}

sc.close();

}
}
