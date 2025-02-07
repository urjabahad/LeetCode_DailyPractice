class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){return 0;}
        int left=0, right;
        int length=0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left=map.get(s.charAt(right))+1;
            }
            map.put(s.charAt(right),right);
            length=Math.max(right-left+1,length);
        }
        return length;
    }
}