package Revision;

import java.util.ArrayDeque;
import java.util.Deque;

public class TwoZero {
    class Solution {
        public boolean isValid(String s) {
            if(s == null)return false;
            if(s.isEmpty())return true;

            Deque<Character> stack = new ArrayDeque<>();

            for(char currentChar : s.toCharArray())
            {
                if(currentChar == '(' || currentChar == '[' || currentChar == '{')
                {
                    stack.push(currentChar);
                }
                else
                {
                    if(stack.isEmpty())return false;
                    char topElement = stack.pop();

                    if(currentChar == ')' && topElement != '(')return false;
                    if(currentChar == ']' && topElement != '[')return false;
                    if(currentChar == '}' && topElement != '{')return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
