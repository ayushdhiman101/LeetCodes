class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int startColor = image[sr][sc];

        if(startColor == color)
            return image;

        dfs(image, sr, sc, color, startColor);

        return image;
    }

    public void dfs(int[][] image, int i, int j, int color, int startColor) {

        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length
           || image[i][j] != startColor) {
            return;
        }

        image[i][j] = color;

        dfs(image, i - 1, j, color, startColor);
        dfs(image, i + 1, j, color, startColor);
        dfs(image, i, j - 1, color, startColor);
        dfs(image, i, j + 1, color, startColor);
    }
}