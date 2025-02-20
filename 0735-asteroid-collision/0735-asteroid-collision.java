import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean collision = false;
            while (!stk.isEmpty() && asteroid < 0 && stk.peek() > 0) {
                int top = stk.peek();
                if (Math.abs(top) == Math.abs(asteroid)) {
                    stk.pop();
                    collision = true;
                    break;
                } else if (Math.abs(top) > Math.abs(asteroid)) {
                    collision = true; 
                    break;
                } else {
                    stk.pop();
                }
            }
            if (!collision) {
                stk.push(asteroid);
            }
        }
        int[] result = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            result[i] = stk.get(i);
        }
        
        return result;
    }
}
