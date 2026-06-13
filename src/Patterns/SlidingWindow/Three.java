package Patterns.SlidingWindow;

import java.util.HashMap;

public class Three{
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int maxLength = 0;
            HashMap<Character,Integer> map = new HashMap<>();
            for(int right = 0; right < s.length(); right++)
            {
                char rightChar = s.charAt(right);
                map.put(rightChar,map.getOrDefault(rightChar,0)+1);

                while(map.get(rightChar) > 1 )
                {
                    char leftChar = s.charAt(left);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if(map.get(leftChar) == 0)
                    {
                        map.remove(leftChar);
                    }
                    left++;
                }
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength,currentLength);
            }
            return maxLength;
        }
    }
}
