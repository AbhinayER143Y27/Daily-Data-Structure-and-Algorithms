package String;

public class ThreeFourFIve {
    class Solution {
        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while(left < right)
            {
                while(left < right && !isVowel(chars[left]))
                {
                    left++;
                }
                while(left  < right && !isVowel(chars[right]))
                {
                    right--;
                }
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            return new String(chars);
        }
        private boolean isVowel(char c)
        {
            return c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i'
                    || c == 'O' || c == 'o' || c == 'U' || c == 'u';
        }
    }
}
