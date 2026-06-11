package Patterns.SlidingWindow;

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;
        for(int right = 0; right < fruits.length; right++)
        {
            int rightVal = fruits[right];
            map.put(rightVal,map.getOrDefault(rightVal,0)+1);

            while(map.size() > k)
            {
                int leftVal = fruits[left];
                map.put(leftVal,map.get(leftVal) - 1);
                if(map.get(leftVal) == 0)
                {
                    map.remove(leftVal);
                }
                left++;
            }
            int currentLength = right - left + 1;
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
    }
}