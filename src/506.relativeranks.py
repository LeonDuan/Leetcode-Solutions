class Solution:
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        
        nums_temp = nums[:]
        nums_temp.sort(reverse=True)
        d = {}
        
        result = []
        for i, v in enumerate(nums_temp):
            d[v] = i + 1
        
        for num in nums:
            
            if d[num] == 1:
                result.append("Gold Medal")
            elif d[num] == 2:
                result.append("Silver Medal")
            elif d[num] == 3:
                result.append("Bronze Medal")
            else:
                result.append(str(d[num]))
        return result
            