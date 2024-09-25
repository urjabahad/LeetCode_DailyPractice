class Solution {
    public int maxSubArray(int[] nums) {
        int temp=0;
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            if(temp>maximum){
                maximum=temp;
            }
            if(temp<=0){
                temp=0;
            }
      }
      return maximum;  
    }
}