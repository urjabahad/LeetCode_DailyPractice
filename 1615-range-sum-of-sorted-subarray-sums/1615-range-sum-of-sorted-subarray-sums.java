import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int MOD = 1000000007;
        
        int lengthOfSubarray = n * (n + 1) / 2;
        int[] subarray = new int[lengthOfSubarray];
        int k = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                subarray[k++] = sum;
            }
        }
        
        Arrays.sort(subarray);
        
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarray[i]) % MOD;
        }
        
        return (int) result;
    }
}
