import java.util.*;

public class SubString {

    // Creating a substring using .charAt() method
    public static String subStringCreation(String s1, int startIndex, int endIndex) {
        String sub = "";
        for (int i = startIndex; i < endIndex; i++) {
            sub += s1.charAt(i);  
        }
        return sub;
    }

    // Comparing substrings from .charAt() and .substring() methods
    public static boolean stringComparision(String sub1, String sub2) {
        return sub1.equals(sub2); // Returning comparison result
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for input string
        System.out.println("Enter a string:");
        String s1 = input.next();

        // Asking for indices to create substrings
        System.out.println("Enter starting index and ending index to create a substring:");
        int startIndex = input.nextInt();
        int endIndex = input.nextInt();

        String sub1 = subStringCreation(s1, startIndex, endIndex); // Using .charAt() method
        String sub2 = s1.substring(startIndex, endIndex);          // Using .substring() method
        
        boolean ans = stringComparision(sub1, sub2); // Comparing substrings
        if (ans) {
            System.out.println("Output from .charAt() method " + "(" + sub1 + ")" + 
                               " and .substring() method " + "(" + sub2 + ")" + " is same.");
        } else {
            System.out.println("Output from .charAt() method " + "(" + sub1 + ")" + 
                               " and .substring() method " + "(" + sub2 + ")" + " is not same.");
        }
    }
}