package ArrayList;

public class OneSixTwo {class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check the slope
            if (nums[mid] < nums[mid + 1]) {
                // We are in an upward trend (Up-slope).
                // The peak is definitely to the right.
                low = mid + 1;
            } else {
                // We are in a downward trend (Down-slope).
                // The peak is either here at 'mid' or to the left.
                // NOTE: We do NOT do 'mid - 1' because 'mid' could be the peak.
                high = mid;
            }
        }
        // When low == high, we found the peak.
        return low;
    }
}
}
