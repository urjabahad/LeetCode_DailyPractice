// O(n^2)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] result = new int[m];
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.put(nums2[i], i);
        }
        for (int i = 0; i < m; i++) {
            result[i] = check(nums2, pos.get(nums1[i]), nums1[i]);
        }
        return result;
    }
    
    private int check(int[] nums, int index, int val) {
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > val) return nums[i];
        }
        return -1;
    }
}
