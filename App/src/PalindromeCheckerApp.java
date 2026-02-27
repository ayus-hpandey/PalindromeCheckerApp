import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =================================================
 *        MAIN CLASS - UC6PalindromeCheckerApp
 * =================================================
 *
 * UC6: Stack and Queue Based Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by using stack and queue data structure
 *
 * @author ayushpandey
 * @version 6.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input="civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack();
        for(char c: input.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            if(queue.remove()!=stack.pop()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Input String :"+input);
        System.out.println("Is Palindrome? : "+isPalindrome);

                }
            }

