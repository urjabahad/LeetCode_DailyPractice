class Solution {
    public List<String> commonChars(String[] words) {

        int[] count = new int[26];
        Arrays.fill(count, 0);
        String word=words[0];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int numVal=(int)ch;
            count[numVal-97]++;
        }

        int temp[]=new int[26];
        Arrays.fill(temp, 0);
        for(int i=1;i<words.length;i++){
            String tempWord=words[i];
            for(int j=0;j<tempWord.length();j++){ 
                char ch=tempWord.charAt(j); 
                int numVal=(int)ch;
                temp[numVal-97]++;
            }
            for(int k=0;k<count.length;k++){ 
                count[k]=Math.min(count[k],temp[k]);
            }
            //reset the temp array  
            Arrays.fill(temp, 0);
           
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<count.length;i++){
            int noOfTimeToAdd=count[i];
            int numVal=i+97;
            char ch=(char)numVal;
            for(int j=1;j<=noOfTimeToAdd;j++){ 
                result.add(Character.toString(ch));
            }
        }
        return result;
    }
}
