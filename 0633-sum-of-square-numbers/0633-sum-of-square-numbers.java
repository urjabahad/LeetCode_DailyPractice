import java.util.*;

class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        for (int a = 0; a <= Math.sqrt(c / 2); a++) {
            int bSquared = c - a * a;
            int b = (int) Math.sqrt(bSquared);
            
            if (b * b == bSquared) {
                return true;
            }
        }
        
        return false;
    }
}
