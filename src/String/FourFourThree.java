package String;

public class FourFourThree {
    class Solution {
        public int compress(char[] chars) {
            int write = 0;
            int read = 0;

            while (read < chars.length) {
                char currentChar = chars[read];
                int start = read;
                while(read < chars.length && currentChar == chars[read])
                {
                    read++;
                }
                chars[write] = currentChar;
                write++;

                int count = read - start;
                if (count > 1) {
                    String value = String.valueOf(count);
                    for(char c : value.toCharArray())
                    {
                        chars[write] = c;
                        write++;
                    }
                }
            }
            return write;
        }
    }
}
