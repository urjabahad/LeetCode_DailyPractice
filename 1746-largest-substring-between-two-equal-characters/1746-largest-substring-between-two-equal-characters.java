class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxDist=-1;
        for(int i=0;i<s.length();i++){
            int lastIndex=s.lastIndexOf(s.charAt(i));
            if(lastIndex!=-1){
                if(maxDist<(lastIndex-i-1)){
                    maxDist=lastIndex-i-1;
                }
            }
        }
        return maxDist;
    }
}