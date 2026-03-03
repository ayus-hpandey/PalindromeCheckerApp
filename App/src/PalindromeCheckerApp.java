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


        String orginalString = "mottom";
        List<Character> list= new LinkedList<>();
//        LinkedList list = new LinkedList();
//
//
//
for(char c : orginalString.toCharArray()) {
    list.add(c);
}
//list.printAll();

        while(!list.isEmpty()) {
            if (list.removeFirst()!=list.removeLast()) {
                System.out.println(" The given string " + orginalString + " is not palindrome ");
                return;
            }
            if(list.size()==1)
                break;

        }
        System.out.println(" The given string " + orginalString + " is  palindrome ");

    }
}