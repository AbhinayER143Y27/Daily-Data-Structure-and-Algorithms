package HashMap;

import java.util.HashMap;

public class ThreeEightSeven {
    class Solution {
        public int firstUniqChar(String s) {
            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : s.toCharArray())
            {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for(int i = 0; i < s.length(); i++)
            {
                if(map.get(s.charAt(i)) == 1)
                {
                    return i;
                }
            }
            return -1;
        }
    }
    // This one is for the array way answer
    /*class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char ch : s.toCharArray())
        {
            count[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(count[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}*/
}
