//package ArrayList;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class LongCons {
//
//    Set<Integer> st = new HashSet<>();
//    Map<Integer,Integer> mp = new HashMap<>();
//
//    for(int i = 0; i < nums.length; i++)
//    {
//        st.add(nums[i]);
//    }
//
//    for(int i = 0; i < nums.length; i++)
//    {
//        if(mp.containsKey(Value))
//        {
//            continue;
//        }
//        int value = 0;
//        int length = 0;
//        while(st.contains(value))
//        {
//            if(mp.containsKey(value))
//            {
//                int nextLength = mp.get(value);
//                length = length + nextLength;
//                break;
//            }
//            length++;
//            mp.put(value,0);
//            value++;
//        }
//        mp.put(nums[i],length);
//    }
//}
