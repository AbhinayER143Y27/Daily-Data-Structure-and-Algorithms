package Patterns.SlidingWindow;

import java.util.HashMap;

public class SevenSix {
    class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character,Integer> targetMap = new HashMap<>();
            for(int i = 0; i < t.length(); i++)
            {
                char c = t.charAt(i);
                targetMap.put(c,targetMap.getOrDefault(c,0)+1);
            }
            int left = 0;
            int minLength = Integer.MAX_VALUE;
            int matched = 0;
            int subStart = 0;

            for(int right = 0; right < s.length(); right++)
            {
                char rightChar = s.charAt(right);
                if(targetMap.containsKey(rightChar))
                {
                    targetMap.put(rightChar,targetMap.get(rightChar) - 1);
                    if(targetMap.get(rightChar) == 0)
                    {
                        matched++;
                    }
                }
                while(targetMap.size() == matched)
                {
                    int scoreKeeper = right - left + 1;

                    if(scoreKeeper < minLength)
                    {
                        minLength = scoreKeeper;
                        subStart = left;
                    }

                    char LeftChar = s.charAt(left);

                    if(targetMap.containsKey(LeftChar))
                    {
                        if(targetMap.get(LeftChar) == 0)
                        {
                            matched--;
                        }
                        targetMap.put(LeftChar, targetMap.get(LeftChar) + 1);
                    }
                    left++;
                }
            }
            return minLength == Integer.MAX_VALUE ? "" : s.substring(subStart, subStart + minLength);
        }
    }
}
