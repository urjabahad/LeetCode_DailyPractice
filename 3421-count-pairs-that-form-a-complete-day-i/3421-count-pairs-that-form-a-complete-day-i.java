class Solution {
    public int countCompleteDayPairs(int[] hours) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int completeDayPairs = 0;
        
        for (int j = 0; j < hours.length; j++) {
            int remainder = hours[j] % 24;
            int complement = (24 - remainder) % 24;
            
            if (countMap.containsKey(complement)) {
                completeDayPairs += countMap.get(complement);
            }
            
            // Update countMap with the current remainder
            countMap.put(remainder, countMap.getOrDefault(remainder, 0) + 1);
        }
        
        return completeDayPairs;
    }
}
