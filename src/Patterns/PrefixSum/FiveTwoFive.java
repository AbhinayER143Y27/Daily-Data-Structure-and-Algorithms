package Patterns.PrefixSum;

import java.util.HashMap;

public class FiveTwoFive {
    class Solution {
        public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer> maps = new HashMap<>();
            int currentSum = 0;
            int maxLength = 0;

            maps.put(0,-1);
            for(int i = 0; i < nums.length; i++)
            {
                int value = (nums[i]) == 0 ? -1 : 1;
                currentSum += value;

                if(maps.containsKey(currentSum))
                {
                    int pastIndex = maps.get(currentSum);
                    maxLength = Math.max(maxLength, i - pastIndex);
                }
                else
                {
                    maps.put(currentSum , i);
                }
            }
            return maxLength;
        }
    }
}
