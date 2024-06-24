class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flipCount = 0;
        int flip = 0;
        int[] diff = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            flip += diff[i];
            if ((nums[i] + flip) % 2 == 0) {
                // Need to flip at position i
                if (i + k > n) {
                    // If the subarray to flip exceeds bounds, it's impossible
                    return -1;
                }
                flipCount++;
                flip++; // increment flip because we're flipping at position i
                diff[i + k]--; // to cancel out the effect after the k-bit flip
            }
        }
        
        return flipCount;
    }
}
