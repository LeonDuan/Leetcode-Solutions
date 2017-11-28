class Solution:
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        self.result = []
        self.rec(nums, [])
        return self.result
    
    def rec(self, nums, soFar):
        if len(nums) == 0:
            self.result.append(soFar)
            return
            
        # take
        take = soFar[:] + [nums[0]]
        self.rec(nums[1:], take)
        
        # not take
        not_take = soFar[:]
        self.rec(nums[1:], not_take)
            