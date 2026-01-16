package binary_search;

public class ThreeFour {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int high = nums.length - 1;
            int low = 0;
            int left_most = -1;
            int right_most = -1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if (target == nums[mid])
                {
                    left_most = mid;
                    high = mid - 1;
                }
                else if(target > nums[mid])
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            low = 0;
            high = nums.length - 1;
            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(target == nums[mid])
                {
                    right_most = mid;
                    low = mid + 1;
                }
                else if(target > nums[mid])
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            return new int[]{left_most,right_most};
        }
    }
}
