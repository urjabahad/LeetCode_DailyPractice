class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(set1.contains(i)){
                intersection.add(i);
            }
        }
        //CONVERT RESULT SET TO ARRAY
        int result[]=new int[intersection.size()];
        int k=0;
        for(int i : intersection){
            result[k++]=i;
        }
        return result;
    }
}