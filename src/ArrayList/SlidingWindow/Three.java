package ArrayList.SlidingWindow;

import java.util.HashSet;

public class Three {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int maxLength = 0;

            HashSet<Character> set = new HashSet<>();
            for(int right = 0; right < s.length(); right++)
            {
                char currentChar = s.charAt(right);

                while(set.contains(currentChar))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(currentChar);
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength,currentLength);
            }
            return maxLength;
        }
    }
}
