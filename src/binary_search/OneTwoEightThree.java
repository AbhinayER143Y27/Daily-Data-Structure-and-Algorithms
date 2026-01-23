package binary_search;

public class OneTwoEightThree {
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int low = 1;
            int high = Integer.MIN_VALUE;
            for(int val : nums)
            {
                high = Math.max(high,val);
            }
            int ans = -1;
            while(low <= high){
                int mid = low + (high - low)/2;
                int sum = 0;
                for(int num : nums)
                {
                    sum += (num + mid - 1)/mid;
                }
                if(sum > threshold)
                {
                    low = mid + 1;
                }
                if(sum <= threshold)
                {
                    ans = mid;
                    high = mid - 1;
                }
            }
            return ans;
        }
    }
}
