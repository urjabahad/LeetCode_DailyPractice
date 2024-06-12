class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp[]=new int[nums.length];
        int k=0;

        if(nums.length==0)
            return temp;
        else if(nums.length==1){
            if(nums[0]==target){
                temp[0]=0;
                return temp;
            }
            else
                return temp;
        }
        else{
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        temp[k++]=i;
                        temp[k++]=j;
                        break;
                    }
                }
            }
        } 
        return Arrays.copyOfRange(temp, 0, 2);       
    }
}