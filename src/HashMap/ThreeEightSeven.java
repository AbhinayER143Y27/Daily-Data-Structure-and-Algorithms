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
                int value = 0;
                if(map.containsKey(s.charAt(i)))
                {
                    value = map.get(s.charAt(i));
                }
                if(value == 1)
                {
                    return i;
                }
            }
            return -1;
        }
    }
}
