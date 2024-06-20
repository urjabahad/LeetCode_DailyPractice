class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int left = 1; // minimum possible distance
        int right = position[position.length - 1] - position[0]; // maximum possible distance
        
        int maxForce = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canPlaceBalls(position, m, mid)) {
                maxForce = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return maxForce;
    }
    
    private boolean canPlaceBalls(int[] position, int m, int minDist) {
        int count = 1; // we start with placing the first ball in the first basket
        int lastPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minDist) {
                count++;
                lastPosition = position[i];
                if (count == m) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
