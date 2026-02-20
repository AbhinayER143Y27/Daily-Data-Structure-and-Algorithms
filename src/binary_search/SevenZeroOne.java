package binary_search;

public class SevenZeroOne {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Did we find it?
            if (nums[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (nums[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        SevenZeroOne solver = new SevenZeroOne();
        int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.println("Searching for 9: " + solver.search(nums, 9));   // Output: 4
        System.out.println("Searching for 2: " + solver.search(nums, 2));   // Output: -1
    }
}