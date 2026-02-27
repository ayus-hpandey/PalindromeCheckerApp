/**
 * =================================================
 *        MAIN CLASS - UC3PalindromeCheckerApp
 * =================================================
 *
 * UC4: Two-Pointer Palindrome Check
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by comparing characters from both ends using a
 * two-pointer approach.
 *
 * @author ayushpandey
 * @version 4.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean isPalindrome = true;
        while(start < end){
            if(chars[start] != chars[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input String: "+input);
        if(isPalindrome) {
            System.out.println("Is Palindrome? : "+isPalindrome);
        }
        else {
            System.out.println("Is Palindrome?: "+isPalindrome);
        }
                }
            }

