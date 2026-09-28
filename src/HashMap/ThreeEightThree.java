package HashMap;

import java.util.HashMap;

public class ThreeEightThree {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> magMap = new HashMap<>();
            for(char x : magazine.toCharArray())
            {
                magMap.put(x, magMap.getOrDefault(x, 0) + 1);
            }
            for(char x : ransomNote.toCharArray())
            {
                if(magMap.containsKey(x)){
                    magMap.put(x,magMap.get(x) - 1); // I think that this one is making the value as in -1 in case of ransomeNote aa and mag ab that is why it is showing true as an output and the else one is not executing. like if the key doesnt exists then only it is going to the else block else if the map contains teh key but now it is may be 0 then it is becoming -1.
                    if(magMap.get(x) == 0)magMap.remove(x); // I have added this one and now it is working properly.
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
    }
}
