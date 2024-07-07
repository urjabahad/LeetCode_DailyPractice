class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numWaterBottlesHelper(numBottles, numExchange, 0);
    }
    
    private int numWaterBottlesHelper(int fullBottles, int numExchange, int emptyBottles) {
        // Base case: If there are no more full bottles to drink
        if (fullBottles == 0 && emptyBottles < numExchange) {
            return 0;
        }
        
        // Drink all the full bottles
        int drank = fullBottles;
        
        // Calculate new empty bottles after drinking
        int newEmptyBottles = fullBottles + emptyBottles;
        
        // Calculate how many new full bottles we can get from exchanging empty ones
        int newFullBottles = newEmptyBottles / numExchange;
        
        // Remaining empty bottles after exchanging
        int remainingEmptyBottles = newEmptyBottles % numExchange;
        
        // Recursively calculate total drank bottles
        return drank + numWaterBottlesHelper(newFullBottles, numExchange, remainingEmptyBottles);
    }
}
