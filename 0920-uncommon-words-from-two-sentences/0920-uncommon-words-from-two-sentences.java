class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(String s : str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : str2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        // List to store the uncommon words
        List<String> resultList = new ArrayList<>();
        
        // Find words that appear exactly once in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                resultList.add(entry.getKey());
            }
        }
        
        // Convert the list to an array and return it
        return resultList.toArray(new String[0]);
    }
}