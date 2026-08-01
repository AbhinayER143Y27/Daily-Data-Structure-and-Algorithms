package Revision;

public class MaxSumSubarrayOfSizeK {
    class Solution {
        public int maxSubarraySum(int[] arr, int k) {
            if(arr == null || arr.length == 0 || k <= 0 || k > arr.length)
            {
                return 0;
            }
            long maxWindowSum = 0;
            long currentWindowSum = 0;

            for(int right = 0; right < k; right++)
            {
                currentWindowSum += (long)arr[right];
            }
            maxWindowSum = currentWindowSum;

            for(int right = k; right < arr.length; right++)
            {
                int left = right - k;
                currentWindowSum += (long) arr[right] - arr[left];
                maxWindowSum = Math.max(currentWindowSum, maxWindowSum);
            }
            return (int)maxWindowSum;
        }
    }
}
