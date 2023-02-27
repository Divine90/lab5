import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        // Create a stack and a queue to hold the characters of the string
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Iterate through the string and add each character to the stack and queue
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // Compare the characters in the stack and queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char c1 = stack.pop();
            char c2 = queue.remove();
            if (c1 != c2) {
                return false; // characters don't match, not a palindrome
            }
        }

        return true; // all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        String s1 = "rotator";
        String s2 = "hello";
        System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
        System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
    }
}
