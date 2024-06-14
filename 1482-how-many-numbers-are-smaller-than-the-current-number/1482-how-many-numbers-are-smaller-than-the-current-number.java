class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        
        for (int num : nums) {
            count[num]++;
        }
        
        int[] prefix = new int[101];
        prefix[0] = 0;
        for (int i = 1; i <= 100; i++) {
            prefix[i] = prefix[i - 1] + count[i - 1];
        }
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[nums[i]];
        }
        
        return result;
    }
}
