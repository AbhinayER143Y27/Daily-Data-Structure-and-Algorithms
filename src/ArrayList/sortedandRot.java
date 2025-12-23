package ArrayList;

public class sortedandRot {
    public static void main(String[] args) {
        Value solver = new Value();

        // Test Case 1: True (Sorted & Rotated)
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Test 1: " + solver.check(nums1));

        // Test Case 2: False (Two drops)
        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Test 2: " + solver.check(nums2));

        // Test Case 3: True (Already sorted)
        int[] nums3 = {1, 2, 3};
        System.out.println("Test 3: " + solver.check(nums3));
    }
}

class Value {
    public boolean check(int[] nums) {
        int counter = 0;
        for(int i = 0; i < (nums.length - 1); i++)
        {
            if(nums[i] > nums[i+1])
            {
                counter++;
            }
        }
        if(nums[nums.length - 1] > nums[0])
        {
            counter++;
        }
        if(counter == 0 || counter == 1) {
            return true;
        }

        return false; // Placeholder
    }
}