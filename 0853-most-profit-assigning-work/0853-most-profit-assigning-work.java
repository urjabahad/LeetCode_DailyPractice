class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;
        
        // Create Job array based on difficulty and profit
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(difficulty[i], profit[i]);
        }
        
        // Sort jobs based on difficulty
        Arrays.sort(jobs, (a, b) -> Integer.compare(a.difficulty, b.difficulty));
        
        // Sort workers based on their ability
        Arrays.sort(worker);
        
        int maxProfit = 0;
        int jobIndex = 0;
        int currentMaxProfit = 0;
        
        // Iterate through each worker and find maximum profit they can achieve
        for (int ability : worker) {
            while (jobIndex < n && jobs[jobIndex].difficulty <= ability) {
                currentMaxProfit = Math.max(currentMaxProfit, jobs[jobIndex].profit);
                jobIndex++;
            }
            maxProfit += currentMaxProfit;
        }
        
        return maxProfit;
    }
    
    // Job class to store difficulty and profit
    private class Job {
        int difficulty;
        int profit;
        
        public Job(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }
}
