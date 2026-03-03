import java.util.LinkedList;
import java.util.List;


public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     * when the program starts.
     * * @param args command-line arguments
     *
     * @author Ayush Pandey
     * @version 1.0
     * UC10: Case-Insensitive & Space-Ignored Palindrome
     */
    public static boolean isPalindrome(String str) {
      str=str.trim().toLowerCase();
      for(int i=0;i<str.length()/2;i++){
          if(str.charAt(i)!=str.charAt(str.length()-i-1)){
              return false;
          }
      }
      return true;
    }
    public static void main(String[] args) {


        String orginalString = "Swastika";

        System.out.println(" The given string " + orginalString + " is palindrome :"+isPalindrome(orginalString));

    }
}