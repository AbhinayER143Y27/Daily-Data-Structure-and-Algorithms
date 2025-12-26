package ArrayList;

import java.util.Arrays;

public class MinTheMax {
    public static void main(String[] args) {
        Sol solver = new Sol();

        // Test Case 1
        int[] nums1 = {10, 1, 2, 7, 1, 3};
        int p1 = 2;
        System.out.println("Test 1 Result: " + solver.minimizeMax(nums1, p1));
        // Expected: 1. Pairs: (1, 1) and (2, 3). Max diff is 1.

        // Test Case 2
        int[] nums2 = {4, 2, 1, 2};
        int p2 = 1;
        System.out.println("Test 2 Result: " + solver.minimizeMax(nums2, p2));
        // Expected: 0. Pair: (2, 2). Diff is 0.

        // Test Case 3 (Zero pairs needed)
        int[] nums3 = {1, 2, 3, 4};
        int p3 = 0;
        System.out.println("Test 3 Result: " + solver.minimizeMax(nums3, p3));
        // Expected: 0. No pairs needed, so max difference is 0.
    }
}

class Sol {
    public int minimizeMax(int[] nums, int p) {
        // Step 1: Sort the array.
        // Closest pairs are always neighbors in a sorted array.
        Arrays.sort(nums);

        // Step 2: Define Binary Search Range.
        int left = 0; // Best case: difference is 0
        int right = nums[nums.length - 1] - nums[0]; // Worst case: max - min
        int result = right;

        // Step 3: Binary Search on the "Answer" (the allowed difference)
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if we can find 'p' pairs with difference <= mid
            if (canFormPairs(nums, p, mid)) {
                result = mid;   // This difference works! Try to find a smaller one.
                right = mid - 1;
            } else {
                left = mid + 1; // This difference is too strict. We need a bigger gap.
            }
        }
        return result;
    }

    // The Greedy Checker
    private boolean canFormPairs(int[] nums, int p, int diffLimit) {
        int count = 0;
        int i = 0;

        while (i < nums.length - 1) {
            // Check the gap between current number and its neighbor
            if (nums[i + 1] - nums[i] <= diffLimit) {
                count++;
                i += 2; // VITAL: We used both numbers. Skip to the next fresh pair.
            } else {
                i++;    // Gap too big. Try the next number.
            }
        }

        return count >= p;
    }
}