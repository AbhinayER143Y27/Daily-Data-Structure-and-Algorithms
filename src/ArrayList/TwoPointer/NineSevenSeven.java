package ArrayList.TwoPointer;

public class NineSevenSeven {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] nums2 = new int[nums.length];
            int left = 0, right = nums.length - 1;
            int index = nums.length - 1;
            while(left <= right)
            {
                int leftSqr = nums[left] * nums[left];
                int rightSqr = nums[right] * nums[right];
                if(leftSqr > rightSqr)
                {
                    nums2[index--] = leftSqr;
                    left++;
                }
                else
                {
                    nums2[index--] = rightSqr;
                    right--;
                }
            }
            return nums2;
        }
    }
}
