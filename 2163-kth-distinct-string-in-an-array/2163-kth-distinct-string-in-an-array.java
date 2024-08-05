class Solution {
    public String kthDistinct(String[] arr, int k) {
        if(k==0 || arr.length==0){
            return "";
        }
        //Hashmap of the input array
        HashMap<String,Integer> map=new HashMap<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        //Map doesnt preserve the orignal order of elements, hence traversing the array again.
        for(String s : arr){
            if(map.get(s)==1){
                k--;
            }
            if(k==0){
                return s;
            }
        }
        return "";
        
    }
}