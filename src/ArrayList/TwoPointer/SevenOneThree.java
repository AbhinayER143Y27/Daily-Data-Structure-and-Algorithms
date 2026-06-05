package ArrayList.TwoPointer;

public class SevenOneThree {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int left = 0;
            int cal = 1;
            int count = 0;
            for(int right = 0; right < nums.length; right++)
            {
                if(k <= 1)
                {
                    return 0;
                }
                cal *= nums[right] ;
                while(cal >= k)
                {
                    cal /= nums[left];
                    left++;
                }
                count += right - left + 1;
            }
            return count;
        }
    }
}
