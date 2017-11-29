class Solution:
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        self.result = []
        self.rec(k, n, [], 1)
        return self.result
    def rec(self, k, n, soFar, cur_num):

        if sum(soFar) == n and len(soFar) == k:
            self.result.append(soFar)
            return
        
        if sum(soFar) > n or len(soFar) > k or cur_num == 10:
            return
        
        self.rec(k, n, soFar + [cur_num], cur_num + 1)
        self.rec(k, n, soFar, cur_num + 1)