class Solution:
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        if len(grid) == 0:
            return 0;
        result =[[0 for i in range(len(grid[0]))] for j in range(len(grid))]
        
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if i == 0 and j == 0:
                    result[i][j] = grid[i][j]
                elif i == 0 and j != 0:
                    result[i][j] = result[i][j-1] + grid[i][j]
                elif i != 0 and j == 0:
                    result[i][j] = result[i-1][j] + grid[i][j]
                else:
                    result[i][j] = min(result[i-1][j], result[i][j-1]) + grid[i][j]
        return result[len(grid)-1][len(grid[0])-1]