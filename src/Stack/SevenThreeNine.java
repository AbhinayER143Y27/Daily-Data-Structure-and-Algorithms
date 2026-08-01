package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[length];

        for(int i = 0; i < temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int value = stack.pop();
                answer[value] = i - value;
            }
            stack.push(i);
        }
        return answer;
    }
}