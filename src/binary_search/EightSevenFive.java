package binary_search;

public class EightSevenFive {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int low = 0;
            int high = findMax(piles);
            int ans = high;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(calculateTotalHours(mid,piles) <= h)
                {
                    ans = mid;
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            return ans;
        }
        private long calculateTotalHours(int speed,int[] piles)
        {
            long totalHours = 0;
            for(int pile : piles)
            {
                totalHours += (pile + speed - 1)/speed;
            }
            return totalHours;
        }
        private int findMax(int[] piles)
        {
            int max = 0;
            for(int pile : piles)
            {
                max = Math.max(max,pile);
            }
            return max;
        }
    }

}
