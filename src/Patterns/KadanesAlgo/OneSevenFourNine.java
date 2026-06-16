package Patterns.KadanesAlgo;

public class OneSevenFourNine {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            if(nums == null || nums.length == 0)return 0;

            int max = nums[0];
            int min = nums[0];
            int global_max = Math.abs(nums[0]);
            for(int i = 1; i < nums.length; i++)
            {
                int currNum = nums[i];
                max = Math.max(currNum , max + currNum);
                min = Math.min(currNum, min + currNum);

                int maxAbs = Math.abs(max);
                int minAbs = Math.abs(min);
                global_max = Math.max(global_max,Math.max(maxAbs,minAbs));
            }
            return global_max;
        }
    }
}
