package ArrayList;

import java.sql.Array;
import java.util.*;

public class CharFreq {

    char[] chars = {'a', 'b', 'c', 'a', 'd', 'b', 'a', 'z', 'y', 'z'};

    ArrayList<ArrayList<Object>> al = new ArrayList<>();

    Map<Character, Integer> Maps = new HashMap<>();

    public void countFrequency() {

        for (int i = 0; i < chars.length; i++) {
            char key = chars[i];
            if (Maps.containsKey(key)) {
                int prev = Maps.get(key);
                Maps.put(key, prev + 1);
            } else {
                Maps.put(key, 1);
            }
        }
        System.out.println(Maps + "This is the list ");

        for(Map.Entry<Character,Integer> entry : Maps.entrySet())
        {
            ArrayList<Object> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());

            al.add(pair);
        }
        System.out.println("ArrayList of key-value pairs:");
        for(ArrayList<Object> pair : al)
        {
            char key = (char) pair.get(0);
            int freq = (int) pair.get(1);

            System.out.println(key + " = " + freq);
        }
    }

    public static void main(String[] args) {
        CharFreq cf = new CharFreq();
        cf.countFrequency();
    }
}
