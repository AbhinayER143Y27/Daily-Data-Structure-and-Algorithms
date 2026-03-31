package ArrayList.SlidingWindow;

public class TwoZeroNine {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0;
            int currentSum = 0;
            int minLength = Integer.MAX_VALUE;
            int currentLength = 0;
            for(int right = 0; right < nums.length; right++)
            {
                currentSum += nums[right];
                while(currentSum >= target)
                {
                    currentLength = right - left + 1;
                    minLength = Math.min(minLength,currentLength);
                    currentSum = currentSum - nums[left];
                    left++;
                }
            }
            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
    }
}
