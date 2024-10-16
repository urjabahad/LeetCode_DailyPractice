class Solution {
    public int[] searchRange(int[] nums, int target) {
      int result[]={-1,-1};
      int start=0, end=nums.length-1,mid;
      //for start index
      while(start<=end){
        mid=(start+end)/2;
        if(nums[mid]<target){
            start=mid+1;            
        }
        else if(nums[mid]>target){
            end=mid-1;
        }
        else{
            result[0]=mid;
            end=mid-1;
        }
      }
      if(result[0]==-1){
        return result;
      }
      // Reset start and end for searching the end index
        start = 0;
        end = nums.length - 1;
      //for end index
      while(start<=end){
        mid=(start+end)/2;
        if(nums[mid]<target){
            start=mid+1;
        }
        else if(nums[mid]>target){
            end=mid-1;
        }
        else{
            result[1]=mid;
            start=mid+1;
        }
      }
      return result;
    }
}