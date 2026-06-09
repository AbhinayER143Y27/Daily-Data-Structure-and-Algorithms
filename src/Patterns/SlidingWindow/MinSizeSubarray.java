package Patterns.SlidingWindow;

public class MinSizeSubarray {

    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLength = Integer.MAX_VALUE;
            int windowSum = 0;
            int left = 0;
            for(int right = 0; right < nums.length; right++)
            {
                windowSum += nums[right];
                while(windowSum >= target)
                {
                    int length = (right - left + 1);
                    minLength = Math.min(length, minLength);
                    windowSum = windowSum - nums[left];
                    left++;
                }
            }
            return minLength == Integer.MAX_VALUE? 0 : minLength;
        }
    }
}
