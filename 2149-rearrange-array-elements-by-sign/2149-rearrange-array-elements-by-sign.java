class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenArray[]=new int[nums.length/2];
        int even=0;
        int oddArray[]=new int[nums.length/2];
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                oddArray[odd++]=nums[i];
            }
            else{
                evenArray[even++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=evenArray[evenArray.length-even];
                even--;
            }
            else{
                nums[i]=oddArray[oddArray.length-odd];
                odd--;
            }
        }
        return nums;
    }
}