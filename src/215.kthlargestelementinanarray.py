import heapq
class Solution:
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        res = []
        for num in nums: heapq.heappush(res, -num)
        
        result = None
        for i in range(k):
            result = -heapq.heappop(res)
        return result