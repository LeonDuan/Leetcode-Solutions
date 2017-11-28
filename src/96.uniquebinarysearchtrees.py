class Solution:
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        self.records = {}
        nums = [i+1 for i in range(n)]
        self.result = 0
        return self.rec(nums, "")
        

    def rec(self, nums, sf):
        if len(nums) in self.records:
            return self.records[len(nums)]
        
        if len(nums) == 1:
            return 1
        if len(nums) == 0:
            return 1
        
        temp_res = 0
        for i in range(len(nums)):
            left_nums = nums[:i]
            right_nums = nums[i+1:]
            temp_res += self.rec(left_nums, sf+str(nums[i])) * self.rec(right_nums, sf+str(nums[i]))
        self.records[len(nums)] = temp_res
        return temp_res