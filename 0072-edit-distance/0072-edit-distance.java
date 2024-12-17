class Solution {
    public int minDistance(String word1, String word2) {
        int arr[][]=new int[word1.length()+1][word2.length()+1];
        // Initialize the first row and first column
        for (int i = 0; i <= word1.length(); i++) {
            arr[i][0] = i; 
        }
        for (int j = 0; j <= word2.length(); j++) {
            arr[0][j] = j;
        }
        int min;
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)!=word2.charAt(j-1)){
                min=Math.min(Math.min(arr[i][j-1],arr[i-1][j-1]),arr[i-1][j]);
                arr[i][j]=min+1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1];
                }
            }
        }
        return arr[word1.length()][word2.length()];
    }
}