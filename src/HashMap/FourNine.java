package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FourNine {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for(String ch : strs)
            {
                char[] toSort = ch.toCharArray();
                Arrays.sort(toSort);
                String Sorted = new String(toSort);
                if(!map.containsKey(Sorted))
                {
                    map.put(Sorted, new ArrayList<>());
                }
                // in this if the current one is tea and after the sort it become aet then tha tea wil lnot be added and that is a problem so noo else in here
                map.get(Sorted).add(ch);
            }
            return new ArrayList<>(map.values());
        }
    }
}
