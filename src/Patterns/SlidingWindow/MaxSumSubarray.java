package Patterns.SlidingWindow;

public class MaxSumSubarray {

    public long maximumSumSubarray(int K, int[] nums) {
        // STEP 1: Handle the edge case if the array length is smaller than K.
        // If it is, return 0.
        if(nums.length < K)
        {
            return 0;
        }


        long windowSum = 0;
        // Hint: Initialize maxSum to the lowest possible value to survive Test Case 2.
        long maxSum = Long.MIN_VALUE;

        for(int high = 0; high < K;high++)
        {
            windowSum += nums[high];
        }
        maxSum = windowSum;
        for(int high = K; high < nums.length; high++)
        {
            int oldTail = nums[high - K];
            int newTail = nums[high];

            windowSum = windowSum - oldTail + newTail;
            maxSum = Math.max(windowSum,maxSum);
        }
        // Replace this with your actual maxSum variable
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSubarray solver = new MaxSumSubarray();

        System.out.println("=== FIXED SLIDING WINDOW TEST SUITE ===");

        // Test Case 1: Standard Array
        int[] nums1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println("Test 1 Output: " + solver.maximumSumSubarray(k1, nums1) + " (Expected: 9)");

        // Test Case 2: The Negative Trap
        int[] nums2 = {-5, -1, -3, -4, -2};
        int k2 = 2;
        System.out.println("Test 2 Output: " + solver.maximumSumSubarray(k2, nums2) + " (Expected: -4)");

        // Test Case 3: Window Size Equals Array Size
        int[] nums3 = {1, 2, 3, 4};
        int k3 = 4;
        System.out.println("Test 3 Output: " + solver.maximumSumSubarray(k3, nums3) + " (Expected: 10)");

        // Test Case 4: Edge Case (Array smaller than K)
        int[] nums4 = {1, 2};
        int k4 = 3;
        System.out.println("Test 4 Output: " + solver.maximumSumSubarray(k4, nums4) + " (Expected: 0)");
    }
}