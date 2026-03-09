import java.util.*;

/**
 ============================================================
 MAIN CLASS - PalindromeCheckerApp
 ============================================================

 Use Case 13: Performance Comparison

 Description:
 This application compares the execution time of
 different palindrome validation algorithms.

 Algorithms Compared:
 1. Two Pointer Approach
 2. Stack Based Approach
 3. Deque Based Approach

 The application:
 - Executes each algorithm
 - Captures execution time using System.nanoTime()
 - Displays performance results

 @author Ayush Pandey
 @version 13.0
 ============================================================
 */

public class UseCase13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input
        String cleaned = input.replaceAll("\\W", "").toLowerCase();

        long start1 = System.nanoTime();
        boolean result1 = twoPointer(cleaned);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(cleaned);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(cleaned);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + time3 + " ns");

        sc.close();
    }

    public static boolean twoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackMethod(String str) {
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

    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}