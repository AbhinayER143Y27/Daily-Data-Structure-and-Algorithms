package ArrayList.SlidingWindow;

public class OneZeroZeroFour {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int maxLength = 0;
            int counter = 0;
            int left = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 0)
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
                maxLength = Math.max(maxLength,i - left + 1);
            }
            return maxLength;
        }
    }
}
