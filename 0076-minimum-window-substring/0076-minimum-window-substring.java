class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        
        // Frequency arrays for characters in t and current window in s
        int[] freqT = new int[128];  // Assuming ASCII characters
        int[] freqS = new int[128];
        
        // Populate frequency array for t
        for (char c : t.toCharArray()) {
            freqT[c]++;
        }
        
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;
        int requiredCharacters = t.length();
        int formedCharacters = 0;
        
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            freqS[rightChar]++;
            
            // Check if the current character matches one in t
            if (freqT[rightChar] > 0 && freqS[rightChar] <= freqT[rightChar]) {
                formedCharacters++;
            }
            
            // Try to shrink the window from the left
            while (formedCharacters == requiredCharacters) {
                // Calculate current window size
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    minLeft = left;
                }
                
                char leftChar = s.charAt(left);
                
                // Remove left character from window
                freqS[leftChar]--;
                
                // Check if we lose one required character
                if (freqT[leftChar] > 0 && freqS[leftChar] < freqT[leftChar]) {
                    formedCharacters--;
                }
                
                // Move left pointer to the right to shrink window
                left++;
            }
            
            // Move right pointer to expand window
            right++;
        }
        
        // Return the minimum window substring if found, otherwise empty string
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}
