class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,List<Integer>>graph=new HashMap<>();
        /*
        1->2
        2->1,3,4
        3->2
        4->2
        */
        //int center=-1;
        int n=edges.length+1;
        //Initialise
        for(int i=1;i<n+1;i++){
            graph.put(i,new ArrayList());
        }
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        for(Integer i : graph.keySet()){
            if(graph.get(i).size()==n-1){
                return i;
            }
        }
        return -1;
    }
}
