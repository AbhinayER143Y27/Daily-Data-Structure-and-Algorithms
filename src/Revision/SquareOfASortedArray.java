package Revision;

public class SquareOfASortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int index = nums.length - 1;
            int[] nums2 = new int[nums.length];
            while(left <= right)
            {
                int leftValue = nums[left] * nums[left];
                int rightValue = nums[right] * nums[right];

                if(leftValue < rightValue)
                {
                    nums2[index] = rightValue;
                    index--;
                    right--;
                }
                else
                {
                    nums2[index] = leftValue;
                    index--;
                    left++;
                }
            }
            return nums2;
        }
    }
}
