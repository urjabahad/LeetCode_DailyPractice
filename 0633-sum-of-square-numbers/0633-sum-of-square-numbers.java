class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int)Math.sqrt(c);
        
        while (left <= right) {
            long sum = (long)left * left + (long)right * right; 
            if (sum > c) {
                right -= 1;
            } else if (sum < c) {
                left += 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
}
