class Solution {
    public boolean isBipartite(int[][] graph) {
        int colors[]= new int[graph.length];
        Arrays.fill(colors,-1);
        for(int i=0;i<graph.length;i++){
            if(colors[i]==-1){
                if(!solve(graph,colors,i))
                    return false;
            }
        }
        return true;
    }
    public boolean solve( int[][] graph,int colors[],int i){
        Queue <Integer> q = new LinkedList<>();
        q.add(i);
        colors[i]=0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it:graph[node]){
                if(colors[it]==-1){
                    q.add(it);
                    colors[it]=1+colors[node];                    
                }
                else if(colors[it]==colors[node])
                    return false;
            }
        }
        return true;
    }
}