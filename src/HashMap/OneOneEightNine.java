package HashMap;

import java.util.HashMap;

public class OneOneEightNine {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            HashMap<Character, Integer> textMap = new HashMap<>();
            for(char ch : text.toCharArray())
            {
                textMap.put(ch, textMap.getOrDefault(ch,0) + 1);
            }
            int a = textMap.getOrDefault('a', 0);
            int b = textMap.getOrDefault('b', 0);
            int l = textMap.getOrDefault('l', 0) / 2;
            int o = textMap.getOrDefault('o', 0) / 2;
            int n = textMap.getOrDefault('n', 0);
            int value = Math.min(Math.min(a,b), Math.min(Math.min(l,o),n));

            return value;
        }
    }
}
