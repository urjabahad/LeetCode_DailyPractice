class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if((x+y) < target){return false;}
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(0);
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);

        int directions[]={x,-x,y,-y};
        while(!queue.isEmpty()){
            int a = queue.poll();
            if(a == target) {return true;}
            for(int direction : directions){
                int total = a+direction;
                if(total < 0 || total > x+y){continue;}
                else if(total == target){return true;}
                else if(!visited.contains(total)){
                    visited.add(total);
                    queue.offer(total);
                }
            }
        }
        return false;
    }
}