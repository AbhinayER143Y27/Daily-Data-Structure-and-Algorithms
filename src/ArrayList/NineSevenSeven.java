package ArrayList;

public class NineSevenSeven {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int length = nums.length;
            int low = 0;
            int high = length - 1;

            int[] result = new int[length];
            int writePointer = length - 1;

            while(low <= high)
            {
                int leftSquare = nums[low] * nums[low];
                int rightSquare = nums[high] * nums[high];

                if(leftSquare > rightSquare)
                {
                    result[writePointer] = leftSquare;
                    low++;
                }
                else
                {
                    result[writePointer] = rightSquare;
                    high--;
                }
                writePointer--;
            }
            return result;
        }
    }
}
