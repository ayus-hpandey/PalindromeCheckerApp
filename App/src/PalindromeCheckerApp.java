import java.util.Stack;

/**
 * =================================================
 *        MAIN CLASS - UC3PalindromeCheckerApp
 * =================================================
 *
 * UC4: Stack Based Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by using stack based data structure
 *
 * @author ayushpandey
 * @version 5.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
       String input = "noon";
       Stack<Character> stack = new Stack();
       for(char c: input.toCharArray()){
           stack.push(c);
       }
       boolean isPalindrome=true;
       for(char c:input.toCharArray()){
           if(c!=stack.pop()){
               isPalindrome=false;
               break;
           }
       }
        System.out.println("Input String: "+input);
        System.out.println("Is Palindrome? :"+isPalindrome);
                }
            }

