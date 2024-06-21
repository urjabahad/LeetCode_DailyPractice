class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        
        // Calculate the initial satisfied customers without using any technique
        int initialSatisfied = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                initialSatisfied += customers[i];
            }
        }
        
        // Sliding window to find the maximum additional satisfied customers
        int maxAdditionalSatisfied = 0;
        int currentAdditionalSatisfied = 0;
        
        // Calculate the initial window of size 'minutes'
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                currentAdditionalSatisfied += customers[i];
            }
        }
        
        maxAdditionalSatisfied = currentAdditionalSatisfied;
        
        // Slide the window across the rest of the array
        for (int i = minutes; i < n; i++) {
            // Add the new end of the window
            if (grumpy[i] == 1) {
                currentAdditionalSatisfied += customers[i];
            }
            // Subtract the old start of the window
            if (grumpy[i - minutes] == 1) {
                currentAdditionalSatisfied -= customers[i - minutes];
            }
            
            // Update maxAdditionalSatisfied if we found a better window
            maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, currentAdditionalSatisfied);
        }
        
        // Total satisfied customers is initialSatisfied + maxAdditionalSatisfied
        return initialSatisfied + maxAdditionalSatisfied;
    }
}
