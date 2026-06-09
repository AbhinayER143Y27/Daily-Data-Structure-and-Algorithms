package Patterns.TwoPointer;

public class TwoSix {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int left = 0, right = 1;
            while(right < nums.length)
            {
                if(nums[left] == nums[right])
                {
                    right++;
                }
                else
                {
                    nums[left + 1] = nums[right];
                    left++;
                }
            }
            return left + 1;
        }
    }
}
