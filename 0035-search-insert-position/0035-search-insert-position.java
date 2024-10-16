class Solution {
    public int searchInsert(int[] nums, int target) {
        // to use binary search
        int start=0, end=nums.length-1,mid;
        while(start<end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(start==end){
                break;
            }
        }
        if(nums[start]<target){
            return start+1;
        }
        return start;
    }
}