import java.util.*;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     *when the program starts.
     * * @param args command-line arguments
     * @author ayush pandey
     * @version 1.0

     */
    public static void main(String[] args) {


        String orginalString = "motitom";

        Deque<Character> deque = new ArrayDeque<>();
for(char c : orginalString.toCharArray()) {
    deque.add(c);
}
        while(!deque.isEmpty()) {
            if (deque.removeFirst()!=deque.removeLast()) {
                System.out.println(" The given string " + orginalString + " is not palindrome ");
                return;
            }
            if(deque.size()==1)
                break;

        }
        System.out.println(" The given string " + orginalString + " is  palindrome ");

    }
}