public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        Stack<Integer> stack = new Stack<Integer>();
        int array[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            stack.push(i);
        }
        for (int i = len - 1; i >= 0; i--) {
            array[i] = -1;
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                array[i] = nums[stack.peek()];
            }
            stack.push(i);
        }
        return array;
    }
}