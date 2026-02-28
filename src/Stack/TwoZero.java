import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        // Build the modern Stack
        Deque<Character> stack = new ArrayDeque<>();

        // Loop through every single character in the string
        for (char c : s.toCharArray()) {

            // RULE 1: If it's an OPEN bracket, push it to the top of the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // RULE 2: It must be a CLOSED bracket
            else {
                // Shield: If we have a closing bracket but the stack is empty, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element to inspect it
                char top = stack.pop();

                // If they don't match perfectly, the whole string is trash
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // Final Check: If the stack is completely empty, every open bracket found a partner
        return stack.isEmpty();
    }
}