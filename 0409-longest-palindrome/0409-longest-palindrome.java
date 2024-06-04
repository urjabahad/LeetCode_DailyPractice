import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        
        int length = 0;
        boolean hasOddFrequency = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOddFrequency = true;
            }
        }
        
        if (hasOddFrequency) {
            length++;
        }
        
        return length;
    }
}
