package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FiveZeroThree {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            if(nums == null)return null;
            int n = nums.length;
            Deque<Integer> stack = new ArrayDeque<>();
            int[] ans = new int[n];
            Arrays.fill(ans,-1);
            for(int i = 0; i < 2 * n; i++)
            {
                int index = i % n;
                while(!stack.isEmpty() && nums[stack.peek()] < nums[index])
                {
                    int poopedValue = stack.pop();
                    ans[poopedValue] = nums[index];
                }
                if(index < n)
                {
                    stack.push(index);
                }
            }
            return ans;
        }
    }
}
