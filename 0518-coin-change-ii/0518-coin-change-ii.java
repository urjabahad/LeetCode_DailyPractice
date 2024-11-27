class Solution {
    public int change(int amount, int[] coins) {
      int temp[][]=new int[coins.length+1][amount+1];
      //filling row and column :
        for(int i=0;i<coins.length+1;i++){
            temp[i][0]=1;
        }
        for(int i=1;i<coins.length+1;i++){
            for(int j=1;j<amount+1;j++){
                if(j-coins[i-1]<0){
                    temp[i][j]=temp[i-1][j];
                }
                else{
                    temp[i][j]=temp[i-1][j]+temp[i][j-coins[i-1]];
                }
            }
        }
        return temp[coins.length][amount];
    }
}