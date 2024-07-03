class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if (n <= 4) return 0; 
        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;
        
        // Case 1: Change the 3 largest elements
        minDifference = Math.min(minDifference, nums[n-1] - nums[3]);
        // Case 2: Change the 2 largest elements and the smallest element
        minDifference = Math.min(minDifference, nums[n-2] - nums[2]);
        // Case 3: Change the largest element and the 2 smallest elements
        minDifference = Math.min(minDifference, nums[n-3] - nums[1]);
        // Case 4: Change the 3 smallest elements
        minDifference = Math.min(minDifference, nums[n-4] - nums[0]);
        return minDifference;
    }
}
