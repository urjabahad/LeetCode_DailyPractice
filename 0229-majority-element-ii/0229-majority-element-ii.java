class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List <Integer> list =new ArrayList<>();
        //key,value=>num,freq
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,(map.get(i)+1));
            }
            else
            map.put(i,1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        return list;
        
    }
}