class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right;
        int maxFreq=0;
        int maxWindow=0;
        int hash[]= new int[26]; 

        for(right=0;right<s.length();right++){
            hash[s.charAt(right)-'A']++; //update freq of current character
            maxFreq = Math.max(maxFreq ,hash[s.charAt(right)-'A'] );
            int windowLength=right-left+1;
            if(windowLength - maxFreq > k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            windowLength=right-left+1;
            maxWindow = Math.max(maxWindow ,windowLength);
        }
        return maxWindow;
    }
}