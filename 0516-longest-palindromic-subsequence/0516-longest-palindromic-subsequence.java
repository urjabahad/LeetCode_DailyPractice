class Solution {
public int longestPalindromeSubseq(String s) {
    int len = s.length();
    int[][] dp = new int[len][len];
    for(int i = 0; i < len; i++){
        dp[i][i] = 1;
    }

    for(int i = len - 2; i >= 0; i--){
        char c = s.charAt(i);
        for(int j = i + 1; j < len; j++){
            if(c == s.charAt(j)){
                dp[i][j] = dp[i + 1][j - 1] + 2;
            }else {
              	
                dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
            }
        }
    }
    return dp[0][len - 1];
}
}