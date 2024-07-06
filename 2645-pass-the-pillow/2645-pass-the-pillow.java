class Solution {
    public int passThePillow(int n, int time) {
        int currentPerson = 1;
        int direction = 1; 
        int timeLeft = time;
        
        while (timeLeft > 0) {
            
            if (currentPerson == 1) {
                direction = 1;
            } else if (currentPerson == n) {
                direction = -1;
            }
            
            
            currentPerson += direction;
            
            
            timeLeft--;
        }
        
        return currentPerson;
    }
}
