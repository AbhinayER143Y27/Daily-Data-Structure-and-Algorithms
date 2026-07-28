package Revision;

public class SevenOneThirteen {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(nums == null || nums.length <= 0)
            {
                return 0;
            }
            if(k <= 1)
            {
                return 0;
            }

            int left = 0;
            long cal = 1;
            int totalCount = 0;
            for(int right = 0; right < nums.length; right++)
            {
                cal *= (long)nums[right];
                while(cal >= k && left <= right)
                {
                    cal /= nums[left];
                    left++;
                }
                totalCount += right - left + 1;
            }
            return totalCount;
        }
    }
}
