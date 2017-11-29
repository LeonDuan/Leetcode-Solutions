class Solution:
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0: return []
        result = []      
        up = True
        # upper half

        for idx in range(len(matrix)):
            temp_result = []
            i = idx
            j = 0
            while i >= 0 and j < len(matrix[0]):
                temp_result.append(matrix[i][j])
                j += 1
                i -= 1

            if up:
                result += temp_result
            else:
                result += reversed(temp_result)
            up = not up

        for idx in range(1, len(matrix[0])):
            temp_result = []
            i = len(matrix) - 1
            j = idx
            while i >= 0 and j < len(matrix[0]):
                temp_result.append(matrix[i][j])
                i -= 1
                j += 1

            if up:
                result += temp_result
            else:
                result += reversed(temp_result)
            up = not up


        return result