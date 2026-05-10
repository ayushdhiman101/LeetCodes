class Solution {
    public int[][] floodFill(int[][] image, int i, int j, int color) {
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for (int k = 0; k < n; k++) {
            ans[k] = image[k].clone(); 
        }        
        boolean visited [][] = new boolean[n][m];

        int startColor =  image[i][j];

        dfs(image, i, j, color, ans, visited, n, m, startColor);
        return ans;
    }

    public void dfs(int[][] image, int i, int j, int color, int ans [][], boolean [][] visited, int n, int m, int startColor) {
        if( i < 0 || j < 0 || i >= n || j >= m || image[i][j] != startColor ||  visited[i][j] == true)
            return;

        ans[i][j] = color;
        visited[i][j] = true; 

        dfs(image, i - 1, j, color, ans, visited, n, m, startColor);
        dfs(image, i, j - 1, color, ans, visited, n, m, startColor);
        dfs(image, i + 1, j, color, ans, visited, n, m, startColor);
        dfs(image, i, j + 1, color, ans, visited, n, m, startColor);
        return;
    }
}