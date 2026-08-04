package Revision;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class FourNineSix {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            if(nums1 == null || nums2 == null){return new int[0];}

            Deque<Integer> stack = new ArrayDeque<>();
            Map<Integer, Integer> nextGreatNumber = new HashMap<>();

            for(int currentNum2 : nums2)
            {
                while(!stack.isEmpty() && currentNum2 > stack.peek())
                {
                    int poppedValue = stack.pop();
                    nextGreatNumber.put(poppedValue,currentNum2);
                }
                stack.push(currentNum2);
            }

            int[] result = new int[nums1.length];
            for(int i = 0; i < nums1.length; i++)
            {
                result[i] = nextGreatNumber.getOrDefault(nums1[i],-1);
            }
            return result;
        }
    }
}
