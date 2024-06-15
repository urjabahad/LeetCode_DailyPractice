import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        // Create a list of projects (profit, capital)
        List<int[]> projects = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            projects.add(new int[]{profits[i], capital[i]});
        }
        
        // Sort projects by their capital requirements
        Collections.sort(projects, (a, b) -> Integer.compare(a[1], b[1]));
        
        // Max heap to store profits of available projects
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int currentCapital = w;
        int index = 0;
        
        for (int i = 0; i < k; i++) {
            // Add all projects that we can afford with current capital
            while (index < n && projects.get(index)[1] <= currentCapital) {
                maxHeap.add(projects.get(index)[0]);
                index++;
            }
            
            // If no projects are available that we can afford
            if (maxHeap.isEmpty()) {
                break;
            }
            
            // Choose the project with maximum profit we can afford
            currentCapital += maxHeap.poll();
        }
        
        return currentCapital;
    }
}
