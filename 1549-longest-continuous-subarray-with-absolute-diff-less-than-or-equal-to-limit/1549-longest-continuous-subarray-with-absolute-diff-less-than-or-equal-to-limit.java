class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Add nums[right] to maxDeque maintaining descending order
            while (!maxDeque.isEmpty() && nums[maxDeque.getLast()] < nums[right]) {
                maxDeque.removeLast();
            }
            maxDeque.addLast(right);
            
            // Add nums[right] to minDeque maintaining ascending order
            while (!minDeque.isEmpty() && nums[minDeque.getLast()] > nums[right]) {
                minDeque.removeLast();
            }
            minDeque.addLast(right);
            
            // Ensure the condition is satisfied
            while (nums[maxDeque.getFirst()] - nums[minDeque.getFirst()] > limit) {
                if (maxDeque.getFirst() == left) {
                    maxDeque.removeFirst();
                }
                if (minDeque.getFirst() == left) {
                    minDeque.removeFirst();
                }
                left++;
            }
            
            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}