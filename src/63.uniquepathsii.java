class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int[][] result = new int[height][width];
        if(obstacleGrid[0][0] == 1) return 0;
        else result[0][0] = 1;
        
        for(int i = 0; i &lt; height; i ++){
            for(int j = 0; j &lt; width; j++){
                if(i == 0 &amp;&amp; j == 0) continue;
                if(obstacleGrid[i][j] == 1){
                    result[i][j] = 0;
                }
                else{
                    if(i == 0) result[i][j] = result[i][j-1];
                    else if(j == 0) result[i][j] = result[i-1][j];
                    else{
                        result[i][j] = result[i - 1][j] + result[i][j - 1];
                    }
                }
            }
        }
        return result[height - 1][width - 1];
    }
}