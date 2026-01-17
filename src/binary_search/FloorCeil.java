package binary_search;

public class FloorCeil {

    // TODO: Implement Logic to find the largest number <= target
    public static int findFloor(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low)/2;
           if (nums[mid] <= target)
            {
                ans = nums[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // TODO: Implement Logic to find the smallest number >= target
    public static int findCeil(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else
            {
                ans = nums[mid];
                high = mid - 1;
            }
        }
        return ans;
    }

    // ---------------------------------------------------------
    // BOILERPLATE: Run this to test your code
    // ---------------------------------------------------------
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;

        System.out.println("Target: " + target);
        System.out.println("Array: [3, 4, 4, 7, 8, 10]");

        // Expected Floor: 4 (Largest number <= 5)
        System.out.println("Your Floor: " + findFloor(arr, target));

        // Expected Ceil: 7 (Smallest number >= 5)
        System.out.println("Your Ceil:  " + findCeil(arr, target));
    }
}