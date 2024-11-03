class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){return nums[0];}
        if(nums[0]!=nums[1]){return nums[0];}
        if(nums[nums.length-2]!=nums[nums.length-1]){return nums[nums.length-1];}

        int start=1,end=nums.length-2,mid;
        while(start<=end){
            mid=(start+end)/2;
            if((nums[mid+1]!=nums[mid])&&(nums[mid-1]!=nums[mid])){
                return nums[mid]; 
            }
            if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid+1]==nums[mid])){ //(your on odd index && prev element is same as u => so ure still following the (even, odd) pattern) || checking similar for right
                start=mid+1; // eliminate the left half
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}