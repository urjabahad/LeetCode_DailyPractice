class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n = source.length();
        if (n != target.length()) return -1;
         long ans=0L;
        int[][] mat=new int[26][26];
            for(int i=0;i<26;i++){
            Arrays.fill(mat[i],Integer.MAX_VALUE);
            mat[i][i]=0;
        }
        for(int i=0;i<cost.length;i++){
            mat[original[i]-'a'][changed[i]-'a']=Math.min(mat[original[i]-'a'][changed[i]-'a'],cost[i]);
        }
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++)
                if (mat[i][k] < Integer.MAX_VALUE) {
                    for (int j = 0; j < 26; j++) {
                        if (mat[k][j] < Integer.MAX_VALUE) {
                            mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);
                        }
                    }
                }
        }
       
        for(int i=0;i<n;i++){
            int c1=source.charAt(i)-'a';
            int c2=target.charAt(i)-'a';
            if(mat[c1][c2]==Integer.MAX_VALUE){
                return -1L;
            }else{
                ans+=(long)mat[c1][c2];
            }
        }
        return ans;
    }
}
