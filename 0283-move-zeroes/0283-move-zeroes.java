class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        // Step 2: Fill the remaining positions with zeros
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
