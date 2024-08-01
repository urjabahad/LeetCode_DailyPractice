class Solution {
    public int countSeniors(String[] details) {
        //10+1+2
        int count=0;
        for(int i=0;i<details.length;i++){
            String temp=details[i];
            if(Integer.parseInt(temp.substring(11,13))>60){
                count++;
            }
        }
        return count;
    }
}