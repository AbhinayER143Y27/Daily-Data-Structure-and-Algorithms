package Patterns.FastAndSlowPointer.Array;

public class TwoZeroTwo {
    class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = helper(n);
            while(fast != 1 && fast != slow)
            {
                slow = helper(slow);
                fast = helper(helper(fast));

            }
            return fast == 1;
        }
        private int helper(int n)
        {
            int totalSum = 0;
            while(n != 0){
                totalSum += (n % 10) * (n % 10);
                n = n / 10;
            }
            return totalSum;
        }
    }
}
