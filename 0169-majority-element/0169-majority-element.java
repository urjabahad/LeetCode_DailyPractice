class Solution {
    public int majorityElement(int[] nums) {
        //MOORES VOTING ELEMENT
        int count=0;
        int candidate=0;
        for(int n : nums){
            if(count==0){
                candidate=n;
            }
            if(n==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        //here since we know a majority elemenet always we dont need to do second pass
        return candidate;
    }
}