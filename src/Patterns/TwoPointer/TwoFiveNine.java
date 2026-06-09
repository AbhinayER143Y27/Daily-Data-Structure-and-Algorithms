package Patterns.TwoPointer;
import java.util.Arrays;


public class TwoFiveNine {

    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int counter = 0;
        for(int left = 0; left < nums.length; left++)
        {
            int mid = left + 1, right = nums.length - 1;
            while(mid < right)
            {
                int currentSum = nums[left] + nums[right] + nums[mid];
                if(currentSum < target)
                {
                    counter += (right - mid);
                    mid++;
                }
                else
                {
                    right--;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        TwoFiveNine solver = new TwoFiveNine();

        // Test Case 1: Standard
        int[] nums1 = {-2, 0, 1, 3};
        int target1 = 2;
        System.out.println("Test 1 Output: " + solver.threeSumSmaller(nums1, target1) + " (Expected: 2)");
        // The two triplets are [-2, 0, 1] and [-2, 0, 3]

        // Test Case 2: Empty Array
        int[] nums2 = {};
        int target2 = 0;
        System.out.println("Test 2 Output: " + solver.threeSumSmaller(nums2, target2) + " (Expected: 0)");

        // Test Case 3: No valid triplets
        int[] nums3 = {0, 0, 0};
        int target3 = -1;
        System.out.println("Test 3 Output: " + solver.threeSumSmaller(nums3, target3) + " (Expected: 0)");

        // Test Case 4: All valid triplets
        int[] nums4 = {1, 2, 3, 4};
        int target4 = 15;
        System.out.println("Test 4 Output: " + solver.threeSumSmaller(nums4, target4) + " (Expected: 4)");
    }
}
