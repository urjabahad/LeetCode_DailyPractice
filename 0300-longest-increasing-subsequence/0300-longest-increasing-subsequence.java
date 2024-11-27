class Solution {
    // Binary Search function to find the position to replace or insert a number
    public int binSearch(ArrayList<Integer>list, int start, int end,int n) {
        int mid;
        while(start<end){
            mid=(start+end)/2;
            if(list.get(mid)<n){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){

            int pos=binSearch(list,0,list.size(),nums[i]);
    // If `nums[i]` is larger than any element in the list, it extends the LIS
            if (pos == list.size()) {
                list.add(nums[i]);
            } else {
    // Otherwise, we replace the element at the found position
                list.set(pos, nums[i]);
            }
            }
        return list.size();
    }
}