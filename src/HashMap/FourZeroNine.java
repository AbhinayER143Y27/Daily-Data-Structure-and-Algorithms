package HashMap;

import java.util.HashMap;

public class FourZeroNine {
    class Solution {
        public int longestPalindrome(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : s.toCharArray())
            {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int length = 0;
            boolean isOddNumber =  false;
            for(int val : map.values())
            {
                int number = (val / 2) * 2;
                length += number;
                if(val % 2 == 1)
                {
                    isOddNumber = true; // in here on the a it will be true and then it will be just checking again for b but that will be true and after this loop the length will increase by 1 which will be techincally of a but the last one which actually turned it true will be b so if there was changing of the avlues for the real systems then this will be b written on the screen or in btw correct just saying of nowhere.
                }
            }
            if(isOddNumber)
            {
                length++;
            }
            return length;
        }
    }
}
