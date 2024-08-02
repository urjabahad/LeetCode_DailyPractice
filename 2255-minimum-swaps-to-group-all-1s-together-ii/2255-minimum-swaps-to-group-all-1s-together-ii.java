class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Count total number of 1s in the array
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) totalOnes++;
        }
        
        // If there are no 1s, no swaps needed
        if (totalOnes == 0) return 0;
        
        // Handle edge case where totalOnes > n (impossible scenario)
        if (totalOnes > n) return -1;  // or throw an exception

        // Double the array to handle circular window efficiently
        int[] extendedNums = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extendedNums[i] = nums[i];
            extendedNums[i + n] = nums[i];
        }

        
        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (extendedNums[i] == 1) currentOnes++;
        }
        
        int maxOnesInWindow = currentOnes;
        for (int i = totalOnes; i < n * 2; i++) {
            if (extendedNums[i] == 1) currentOnes++;
            if (extendedNums[i - totalOnes] == 1) currentOnes--;
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }
        
        
        return totalOnes - maxOnesInWindow;
    }
}
