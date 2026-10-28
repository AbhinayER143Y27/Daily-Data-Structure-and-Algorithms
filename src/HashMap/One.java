package HashMap;

import java.util.HashMap;

public class One {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();


            for(int i = 0; i < nums.length; i++)
            {
                int subNumber = target - nums[i];
                if(map.containsKey(subNumber))
                {
                    int result = map.get(subNumber);
                    return new int[]{result,i};
                }
                else
                {
                    map.put(nums[i],i);
                }
            }
            return new int[]{-1,-1};
        }
    }
}
