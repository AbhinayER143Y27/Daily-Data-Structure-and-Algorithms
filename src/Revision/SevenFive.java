package Revision;

public class SevenFive {
    class Solution {
        public void sortColors(int[] nums) {
            if(nums == null || nums.length < 2)
            {
                return;
            }
            int left = 0;
            int mid = 0;
            int high = nums.length - 1;
            while(mid <= high)
            {
                if(nums[mid] == 0)
                {
                    int temp = nums[left];
                    nums[mid] = temp;
                    nums[left] = 0;
                    left++;
                    mid++;
                }
                else if(nums[mid] == 1)
                {
                    mid++;
                }
                else
                {
                    int temp = nums[high];
                    nums[high] = 2;
                    nums[mid] = temp;
                    high--;
                }
            }
        }
    }
}
