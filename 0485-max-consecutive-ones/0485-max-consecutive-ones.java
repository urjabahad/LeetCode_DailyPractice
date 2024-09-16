class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                length++;
            }
            else{
                if(maxLength<length){
                    maxLength=length;
                }
                length=0;
            }
        }
        // Check the length for the last sequence of 1s
        if (maxLength < length) {
            maxLength = length;
        }
        return maxLength;
    }
}