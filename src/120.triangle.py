class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        last_row_idx = len(triangle) - 1
        if last_row_idx == -1:
            return 0
        
        for i in range(last_row_idx,-1,-1):
            for j in range(len(triangle[i])-1):
                triangle[i-1][j] = triangle[i-1][j] + min(triangle[i][j], triangle[i][j+1])
        return triangle[0][0]