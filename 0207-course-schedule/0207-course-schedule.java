class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean [] visited = new boolean[numCourses];
        boolean [] recPath = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(!visited[i]) {
                if(dfs(numCourses, prerequisites, i, visited, recPath))
                    return !true;
            }
        }
        return !false;
    }
    // u ---> v
    public boolean dfs(int numCourses, int[][] prerequisites, int u, boolean [] visited, boolean [] recPath ) {
        visited[u] = true;
        recPath[u] = true;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < prerequisites.length; i++) {
            if(prerequisites[i][0] == u) {
                int v = prerequisites[i][1];
                if(!visited[v]) {
                    if(dfs(numCourses, prerequisites, v, visited, recPath)) {
                        return true;
                    }
                }
                else if (recPath[v]) {
                    return true;
                }
            }
        }

            
        
        recPath[u] = false;
        return false;
    }
}


/*
visited ----> in recPath = cycle 
*/

