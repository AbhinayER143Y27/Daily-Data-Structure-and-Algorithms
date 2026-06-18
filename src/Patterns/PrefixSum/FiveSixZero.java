package Patterns.PrefixSum;

import java.util.HashMap;

public class FiveSixZero {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int currentSum = 0;
            int validSubArrayCount = 0;

            HashMap<Integer,Integer> maps = new HashMap<>();
            maps.put(0,1);

            for(int i = 0; i < nums.length; i++)
            {
                currentSum += nums[i];

                if(maps.containsKey(currentSum - k))
                {
                    validSubArrayCount += maps.get(currentSum - k);
                }
                maps.put(currentSum,maps.getOrDefault(currentSum,0) + 1);
            }
            return validSubArrayCount;
        }
    }
}
