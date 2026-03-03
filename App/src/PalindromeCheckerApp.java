
/**
 * Application entry point
 * This is the first method executed by the JVM
 * when the program starts.
 * * @param args command-line arguments
 *
 * @author Ayush Pandey
 * @version 1.0
 * UC12: Case-Insensitive & Space-Ignored Palindrome
 */
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String str);
}


class LoopStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String str) {
        str = str.trim().toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String str) {
        str = str.trim().toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}


class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.check(str);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";


        PalindromeStrategy strategy = new LoopStrategy();
        // PalindromeStrategy strategy = new StackStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + context.checkPalindrome(input));
    }





}