class Solution {
    public int appendCharacters(String s, String t) {
        int s_len=s.length();
        int t_len=t.length();

        int i=0; // pointer for s
        int j=0; // pointer for t
        while(i<s_len && j<t_len){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return t_len-j;
    }
}