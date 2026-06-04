package ArrayList.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneFive {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            for(int left = 0; left < nums.length; left++)
            {
                int mid = left + 1;
                int right = nums.length - 1;
                if(left > 0 && nums[left] == nums[left - 1])
                {
                    continue;
                }
                while(mid < right)
                {
                    if(nums[left] + nums[mid] + nums[right] == 0)
                    {
                        ans.add(Arrays.asList(nums[left],nums[mid],nums[right]));
                        mid++;
                        right--;
                        while(mid < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }
                        while(mid < right && nums[mid] == nums[mid - 1])
                        {
                            mid++;
                        }
                    }
                    else if(nums[left] + nums[mid] + nums[right] < 0)
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
