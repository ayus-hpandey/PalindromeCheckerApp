/**
 * =====================================================
 *            MAIN CLASS - UC2PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Description:
 * This program performs a simple palindrome validation
 * using a predefined string value. It compares characters
 * from the beginning and end to verify whether the string
 * reads the same both ways and prints the result.
 *
 * @author ayushpandey
 * @version 2.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
    String input = "madam";
    boolean ispalindrome = true;
    for(int i = 0; i<input.length()/2; i++){
        if(input.charAt(i) != input.charAt(input.length()-1-i)){
            ispalindrome=false;
        }
    }
    System.out.println("Input text: "+input);

    System.out.println("Is it a palidrome? : "+ispalindrome);

    }
}