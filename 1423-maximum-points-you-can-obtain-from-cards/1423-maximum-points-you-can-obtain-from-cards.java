class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=cardPoints[i];
        }
        //System.out.print(maxSum+"\t");
        if(k==cardPoints.length){
            return maxSum;
        } else {
            int lsum=maxSum, rsum=0;
            for(int i=0;i<k;i++){
                lsum=lsum-cardPoints[k-i-1]; 
                rsum+=cardPoints[cardPoints.length-1-i];
                maxSum=Math.max(maxSum,rsum+lsum);
            }
        }
        return maxSum;
    }
}