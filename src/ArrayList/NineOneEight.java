package ArrayList;

public class NineOneEight {
    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int currentMax = 0;
            int maxSum = nums[0];
            int currentMin = 0;
            int minSum = nums[0];
            int totalSum = 0;

            for(int i = 0; i < nums.length; i++)
            {
                int currentNum = nums[i];

                totalSum += nums[i];
                currentMax = Math.max(currentMax + currentNum, currentNum);
                maxSum = Math.max(currentMax,maxSum);

                currentMin = Math.min(currentMin + currentNum, currentNum);
                minSum = Math.min(currentMin, minSum);

            }
            return (maxSum < 0) ? maxSum : Math.max(maxSum,totalSum - minSum);
        }
    }
}
