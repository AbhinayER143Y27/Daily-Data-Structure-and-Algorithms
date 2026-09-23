package Stack;

import java.util.Stack;

public class OneTwoZeroNine {
    class Solution {
        public String removeDuplicates(String s, int k) {
            Stack<int[]> stack = new Stack<>();

            for(char ch : s.toCharArray())
            {
                if(!stack.isEmpty() && stack.peek()[0] == ch)
                {
                    if(stack.peek()[1] == k - 1)
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.peek()[1]++;
                    }
                }
                else
                {
                    stack.push(new int[]{ch,1});
                }
            }

            StringBuilder ans = new StringBuilder();
            for(int[] pair : stack)
            {
                for(int i = 0; i < pair[1]; i++)
                {
                    ans.append((char)pair[0]);
                }
            }
            return ans.toString();
        }
    }
}
