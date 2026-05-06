class Solution {
    public int[] findOrder(int V, int[][] edges) {
        boolean [] visited = new boolean[V];
        boolean [] recPath = new boolean[V];

        Stack <Integer> stack = new Stack<>(); 
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(dfs(V, edges, i, stack, visited, recPath))
                    return new int[0];
            }
        }
        int ans [] = new int [stack.size()];
        int i = 0;
        while(!stack.isEmpty()) {
            ans[i++] = stack.pop();
        }
        return ans;
    }
    public boolean dfs(int V, int[][] edges, int curr, Stack stack, boolean [] visited, boolean [] recPath) {
        visited [curr] = true;
        recPath [curr] = true;
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][1];
            int v = edges[i][0];
            if(u == curr) {
                if(!visited[v]) {
                    if(dfs(V, edges, v, stack, visited, recPath))
                        return true;
                } else if (recPath[v]) {
                    return true;
                }
            }
        }
        recPath [curr] = false;
        stack.push(curr); 
        return false;      
    }
}