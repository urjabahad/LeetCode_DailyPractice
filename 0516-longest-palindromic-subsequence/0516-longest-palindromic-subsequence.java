class Solution {
    public int longestPalindromeSubseq(String s) {

        int matrix[][]=new int[s.length()][s.length()];
         // Single character is always a palindrome of length 1
        for (int i = 0; i < s.length(); i++) {
            matrix[i][i] = 1;
        }

        for(int l=2;l<=s.length();l++){
            for(int i=0;i<s.length()-l+1;i++){
                int j = i + l - 1;
                if(l==2 && s.charAt(i)==s.charAt(j)){
                    matrix[i][j] = 2;
                }
                else if(s.charAt(i)==s.charAt(j)){
                    //diagonal element
                    matrix[i][j]=matrix[i+1][j-1]+2;
                }
                else{
                    matrix[i][j]=Math.max(matrix[i][j-1],matrix[i+1][j]);
                }
            }
        }
        return matrix[0][s.length()-1];
    }
}