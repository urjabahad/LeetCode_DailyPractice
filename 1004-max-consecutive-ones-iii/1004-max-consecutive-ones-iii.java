class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                k--;
            }
            while(k<0){
                if(nums[left]==0){
                    k++; // Revert the effect of the 0 that we're moving past
                }
                left++;
            }
            max=Math.max(max, right-left+1);
        }
        return max;
    }
}