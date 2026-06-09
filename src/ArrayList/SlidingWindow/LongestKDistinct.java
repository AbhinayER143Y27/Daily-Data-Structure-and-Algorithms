package ArrayList.SlidingWindow;

import java.util.HashMap;

public class LongestKDistinct {

    public int longestkSubstr(String s, int k) {
        // Edge Case
        if (s == null || s.length() == 0 || k <= 0) {
            return -1;
        }

        int maxLength = -1;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // The Head Eats
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar,map.getOrDefault(rightChar,0) + 1);

            while(map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
                if(map.size() == k)
                {
                    int length = right - left + 1;
                    maxLength = Math.max(maxLength,length);
                }
            }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestKDistinct solver = new LongestKDistinct();

        System.out.println("=== HASHMAP SLIDING WINDOW TEST SUITE ===");

        // Test Case 1: Standard Search
        String s1 = "aabacbebebe";
        int k1 = 3;
        System.out.println("Test 1 Output: " + solver.longestkSubstr(s1, k1) + " (Expected: 7)"); // "cbebebe"

        // Test Case 2: Exact Match
        String s2 = "aaaa";
        int k2 = 1;
        System.out.println("Test 2 Output: " + solver.longestkSubstr(s2, k2) + " (Expected: 4)"); // "aaaa"

        // Test Case 3: Not enough distinct characters
        String s3 = "aaaa";
        int k3 = 2;
        System.out.println("Test 3 Output: " + solver.longestkSubstr(s3, k3) + " (Expected: -1)");

        // Test Case 4: All distinct characters
        String s4 = "abcdef";
        int k4 = 3;
        System.out.println("Test 4 Output: " + solver.longestkSubstr(s4, k4) + " (Expected: 3)");
    }
}