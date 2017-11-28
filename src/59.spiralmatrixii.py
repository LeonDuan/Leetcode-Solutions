class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        if n == 0:
            return []
        i, j = 0, 0
        self.matrix = [[0] * n for i in range(n)]
        self.matrix[0][0] = 1
        self.cur = 2
        self.filled = 1
        
        while self.cur &lt;= n ** 2:
            i,j = self.fillRow(i,j+1,"right")
            i,j = self.fillCol(i+1,j,"down")
            i,j = self.fillRow(i,j-1,"left")
            i,j = self.fillCol(i-1,j,"up")
        
        return self.matrix
        
    def fillRow(self, i, j, dir):
        idx = j
        if dir == "right":
            for idx in range(j, len(self.matrix[0])):
                if self.matrix[i][idx] == 0:
                    self.matrix[i][idx] = self.cur
                    self.cur += 1
                else:
                    idx -= 1
                    break
        else:
            for idx in range(j, -1, -1):
                if self.matrix[i][idx] == 0:
                    self.matrix[i][idx] = self.cur
                    self.cur += 1
                else:
                    idx += 1
                    break
        return (i, idx)
        
    def fillCol(self, i, j, dir):
        idx = i
        if dir == "down":
            for idx in range(i, len(self.matrix)):
                if self.matrix[idx][j] == 0:
                    self.matrix[idx][j] = self.cur
                    self.cur += 1
                else:
                    idx -= 1
                    break
        else:
            for idx in range(i, -1, -1):
                if self.matrix[idx][j] == 0:
                    self.matrix[idx][j] = self.cur
                    self.cur += 1
                else:
                    idx += 1
                    break
        return (idx, j)
            