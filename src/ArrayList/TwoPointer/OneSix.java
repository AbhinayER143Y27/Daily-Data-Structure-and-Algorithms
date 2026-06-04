package ArrayList.TwoPointer;

import java.util.Arrays;

public class OneSix {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int ans = nums[0] + nums[1] + nums[2];
            for(int left = 0; left < nums.length; left++)
            {
                int mid = left + 1;
                int right = nums.length - 1;
                while(mid < right)
                {
                    int currentSum = nums[left] + nums[mid] + nums[right];
                    if(Math.abs(currentSum - target) < Math.abs(ans - target))
                    {
                        ans = currentSum;
                    }
                    if(currentSum < target)
                    {
                        mid++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            return ans;
        }
    }
}
