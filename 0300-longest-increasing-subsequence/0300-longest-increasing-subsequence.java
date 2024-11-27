class Solution {
    public int lengthOfLIS(int[] nums) {
        int temp_arr[]=new int[nums.length];
        Arrays.fill(temp_arr,1);
        int j;
        int max=1;
        for(int i=1;i<nums.length;i++){
            j=0;
            while(j<i){
                if(nums[j]<nums[i]){
                    temp_arr[i]=Math.max(temp_arr[i],temp_arr[j]+1);
                    if(max<temp_arr[i]){
                        max=temp_arr[i];
                    }
                }
            j++;
            }
        }
        //System.out.println(Arrays.toString(temp_arr));
        return max;
    }
}