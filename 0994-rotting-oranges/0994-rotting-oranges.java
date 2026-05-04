class Solution {

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        Queue <int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
            }
        }
        int max = 0;
        while(!q.isEmpty()){
            int[] node = q.poll();
            int i = node[0];
            int j = node[1];
            int time = node[2];

            max = Math.max(max, time);

            if(i - 1 >= 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) {
                visited[i - 1][j] = true;
                q.offer(new int[]{i - 1, j, time + 1});
            }
            if(i + 1 < n && !visited[i + 1][j] && grid[i + 1][j] == 1) {
                visited[i + 1][j] = true;
                q.offer(new int[]{i + 1, j, time + 1});
            }
            if(j - 1 >= 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) {
                visited[i][j - 1] = true;
                q.offer(new int[]{i, j - 1, time + 1});
            }
            if(j + 1 < m && !visited[i][j + 1] && grid[i][j + 1] == 1) {
                visited[i][j + 1] = true;
                q.offer(new int[]{i, j + 1, time + 1});
            }
        } 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] ==  1 && !visited[i][j]) {
                   return -1;
                }
            }
        }
        return max;
    }
}