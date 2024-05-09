class Solution {
    public int majorityElement(int[] nums) {
        //key,value=>number and frequency
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            map.put(i,map.get(i)+1);
            else
            map.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>(nums.length/2))
            return entry.getKey();
        }
        return 0;
    }
}