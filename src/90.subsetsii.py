class Solution:
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        nums.sort()
        self.result = set()
        self.rec(nums, [])
            
        self.result = list(self.result)
        for i in range(len(self.result)):
            self.result[i] = list(map(int, self.result[i].split("+"))) if self.result[i] != '' else []
        return self.result
            
    
    def rec(self, nums, soFar):
        if len(nums) == 0:
            self.result.add("+".join(str(elem) for elem in soFar))
            return
            
        # take
        take = soFar[:] + [nums[0]]
        self.rec(nums[1:], take)
        
        # not take
        not_take = soFar[:]
        self.rec(nums[1:], not_take)
            