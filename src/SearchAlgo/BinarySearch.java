package SearchAlgo;

public class BinarySearch {
    public static void main(String args[]) {
        int[] nums = {2, 12, 15, 17, 27, 29, 45};
        int target = 17;
        System.out.println(Binary(nums,target));
    }

    static int Binary(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low)/2;
        while(low <= high) {
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid])
            {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }return -1;
    }

}
