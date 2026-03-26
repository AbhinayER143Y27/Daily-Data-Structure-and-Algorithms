package ArrayList;

public class OneOne {
    class Solution {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int currentArea = 0;
            int low = 0;
            int high = height.length - 1;
            while(low < high)
            {
                int width = high - low;
                currentArea = width * Math.min(height[low], height[high]);
                maxArea = Math.max(maxArea,currentArea);

                if(height[low] < height[high])
                {
                    low++;
                }
                else if(height[low] > height[high])
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }
            return maxArea;
        }
    }
}
