package binary_search;

public class RotationCount {

    public int findKRotation(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low)/2;
            if(arr[mid] > arr[high])
            {
                low = mid + 1;

            }
            else {
                high = mid;
            }
        }
        return low;
    }

    // ---------------------------------------------------------
    // BOILERPLATE: Run this to test your code
    // ---------------------------------------------------------
    public static void main(String[] args) {
        RotationCount solver = new RotationCount();

        // Case 1: Minimum (1) is at index 3 -> 3 Rotations
        int[] arr1 = {3, 4, 5, 1, 2};
        System.out.println("Rotations: " + solver.findKRotation(arr1)); // Expected: 3

        // Case 2: Minimum (0) is at index 4 -> 4 Rotations
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotations: " + solver.findKRotation(arr2)); // Expected: 4

        // Case 3: Not rotated (Minimum 1 is at index 0)
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Rotations: " + solver.findKRotation(arr3)); // Expected: 0
    }
}