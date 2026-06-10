package Patterns.SlidingWindow;

public class MaxConsOnes {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0;
            int maxLength = 0;
            int counter = 0;
            for(int right = 0; right < nums.length; right++)
            {
                if(nums[right] == 0)
                {
                    counter++;
                }
                while(counter > k)
                {
                    if(nums[left] == 0)
                    {
                        counter--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }
    }
}
