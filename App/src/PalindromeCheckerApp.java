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
     */
    public static boolean isPalindrome(String str , int start , int end ) {
        boolean isPalindrome = true;
        if(str.charAt(start)!=str.charAt(end)) {
            isPalindrome = false;
        }
        if(start>=end){
            return true;
        }
        isPalindrome(str,start+1,end-1);
        return isPalindrome;
    }
    public static void main(String[] args) {


        String orginalString = "Robot";

        System.out.println(" The given string " + orginalString + "is palindrome :"+isPalindrome(orginalString,0,orginalString.length()-1));

    }
}