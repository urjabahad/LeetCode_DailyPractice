class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int k=0;
        for(int num : nums){
            if(num!=0){
                stk.push(num);
            }
        }
        Arrays.fill(nums,0);
        for(int i=stk.size()-1;i>=0;i--){
            nums[i]=stk.pop();
        }
    }
}