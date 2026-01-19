package binary_search;

public class SingleElement {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            int high = n - 1;
            int low = 0;

            if(n == 1)
                return nums[0];
            if(nums[0] != nums[1]) return nums[0];
            if (nums[high] != nums[high - 1]) return nums[high];

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                {
                    return nums[mid];
                }

                if(mid % 2 == 0 && nums[mid + 1] == nums[mid] || mid % 2 == 1 && nums[mid] == nums[mid - 1])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }
}