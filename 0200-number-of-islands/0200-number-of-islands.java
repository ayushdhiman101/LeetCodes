class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean [][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, visited, n, m, i, j);
                    count++;
                }
            }
        }
    return count;
    }
    public void dfs(char[][] grid, boolean[][] visited, int n, int m, int i, int j) {
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        dfs(grid, visited, n, m, i - 1, j);
        dfs(grid, visited, n, m, i + 1, j);
        dfs(grid, visited, n, m, i, j - 1);
        dfs(grid, visited, n, m, i, j + 1);

        return;
    }
}