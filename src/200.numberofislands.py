class Solution:
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        result = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':
                    self.mark(grid, i, j)
                    result += 1
        return result
    
    def mark(self, grid, i, j):
        if i < 0 or i >= len(grid):
            return
        if j < 0 or j >= len(grid[0]):
            return
        if grid[i][j] == '0':
            return
        
        else:
            grid[i][j] = '0'
            self.mark(grid, i + 1, j)
            self.mark(grid, i, j + 1)
            self.mark(grid, i - 1, j)
            self.mark(grid, i, j - 1)