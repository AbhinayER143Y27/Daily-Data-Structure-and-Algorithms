package Patterns.PrefixSum;

import java.util.HashMap;

public class NineSevenFour {
    class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            int currentSum = 0;
            int counter = 0;
            HashMap<Integer,Integer> maps = new HashMap<>();

            maps.put(0,1);
            for(int i = 0; i < nums.length; i++)
            {
                currentSum += nums[i];
                int remainder = currentSum % k;

                if(remainder < 0)
                {
                    remainder += k; // think about this again
                }

                if(maps.containsKey(remainder))
                {
                    counter += maps.get(remainder);
                }
                maps.put(remainder,maps.getOrDefault(remainder,0) + 1);
            }
            return counter;
        }
    }
}
