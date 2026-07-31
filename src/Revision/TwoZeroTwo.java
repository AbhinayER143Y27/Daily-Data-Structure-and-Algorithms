package Revision;

public class TwoZeroTwo {
    class Solution {
        public boolean isHappy(int n) {
            if(n <= 0)return false;
            int slow = n;
            int fast = helper(n);

            while(fast != 1 && fast != slow)
            {
                slow = helper(slow);
                fast = helper(helper(fast));
            }
            return (fast == 1);
        }
        private int helper(int n)
        {
            long totalSum = 0;
            while(n != 0)
            {
                int digit = n%10;
                totalSum += (long)digit * digit;
                n /= 10;
            }
            return (int)totalSum;
        }
    }
}
