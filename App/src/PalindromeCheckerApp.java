import java.util.LinkedList;
import java.util.List;

 class PalindrormeChecker{
    public static boolean checkPalindrome(String str){
        str=str.trim().toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
public class PalindromeCheckerApp {
PalindrormeChecker obj = new PalindrormeChecker();
    /**
     * Application entry point
     * This is the first method executed by the JVM
     * when the program starts.
     * * @param args command-line arguments
     *
     * @author ayush pandey
     * @version 1.0
     * UC10: Case-Insensitive & Space-Ignored Palindrome
     */

    public static void main(String[] args) {


        String orginalString = "lallal";

        System.out.println(" The given string " + orginalString + " is palindrome :"+ PalindrormeChecker.checkPalindrome(orginalString));

    }
}