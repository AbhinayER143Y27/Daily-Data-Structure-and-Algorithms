package ArrayList;
import java.util.*;

public class DiffOfLandS {
    public static void main(String[] args) {
        // Test Cases
        int[] input1 = {2, 1, 8, 4, 3, 9, 5};
        int[] input2 = {-10, 5, 0, 20};
        int[] input3 = {-10, -5, -2};
        Solution solver = new Solution();

        System.out.println("Test 1 Result: " + solver.findDifference(input1)); // Expected: 8 (9 - 1)
        System.out.println("Test 2 Result: " + solver.findDifference(input2)); // Expected: 30 (20 - (-10))
        System.out.println("T3: "+ solver.findDifference(input3));
    }
}

class Solution {
    public int findDifference(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums)
        {
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            if(num > secondLargest && num < largest)
            {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}