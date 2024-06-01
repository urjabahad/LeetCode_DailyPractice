class Solution {
    public String largestOddNumber(String num) {
       for(int i=num.length()-1;i>=0;i--){
        int last=Character.getNumericValue(num.charAt(i));
        if(last%2!=0){
            return num.substring(0,i+1);
        }
       }
       return "";
    }
}
