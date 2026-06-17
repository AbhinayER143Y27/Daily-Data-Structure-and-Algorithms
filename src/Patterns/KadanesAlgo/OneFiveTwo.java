package Patterns.KadanesAlgo;

public class OneFiveTwo {
    class Solution {
        public int maxProduct(int[] nums) {

            if(nums == null || nums.length == 0)
            {
                return 0;
            }

            int currentMax = nums[0];
            int currentMin = nums[0];
            int maxProduct = nums[0];
            for(int i = 1; i < nums.length; i++)
            {
                int currentNum = nums[i];
                if(currentNum < 0)
                {
                    int temp = currentMax;
                    currentMax = currentMin;
                    currentMin = temp;
                }

                currentMax = Math.max(currentNum, currentMax * currentNum);
                currentMin = Math.min(currentNum, currentMin * currentNum);

                maxProduct = Math.max(currentMax, maxProduct);
            }
            return maxProduct;
        }
    }
}
