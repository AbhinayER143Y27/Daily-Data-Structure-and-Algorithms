package ArrayList;

import java.util.*;

public class consLongOne {

    Set<Integer> st = new HashSet<>();
    Map<Integer, Integer> mp = new HashMap<>();
    int[] nums = {100, 4, 200, 1, 3, 2};

    public void calculation() {
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int currentvalue = nums[i];
            if(mp.containsKey(currentvalue))
            {
                continue;
            }
            int length = 0;
            while(st.contains(currentvalue))
            {
                if(mp.containsKey(currentvalue))
                {
                    int nextlength = mp.get(currentvalue);
                    length = length + nextlength;
                    break;

                }
                length++;
                mp.put(currentvalue,0);
                currentvalue++;
            }
            mp.put(nums[i],length);
        }
    }

    public static void main(String args[])
    {

    }
}
