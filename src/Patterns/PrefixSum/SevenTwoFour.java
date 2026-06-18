package Patterns.PrefixSum;

public class SevenTwoFour {
    class Solution {
        public int pivotIndex(int[] nums) {
            int totalSum = 0;
            int leftSum = 0;

            for(int num : nums)
            {
                totalSum += num;
            }

            for(int i = 0; i< nums.length; i++)
            {
                int currentVal = nums[i];
                int rightSum = totalSum - leftSum - currentVal;

                if(leftSum == rightSum)
                {
                    return i;
                }
                leftSum += currentVal;
            }
            return -1;
        }
    }
}
