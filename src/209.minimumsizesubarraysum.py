class Solution:
    def minSubArrayLen(self, s, nums):
        """
        :type s: int
        :type nums: List[int]
        :rtype: int
        """

        i, j, cur_sum = 0, 0, 0
        mins = []

        for i in range(len(nums)):
            if i == 0:
                cur_sum = nums[i]
            else:
                cur_sum -= nums[i - 1]

            while cur_sum < s:
                j += 1
                if j >= len(nums):
                    break
                cur_sum += nums[j]
            if cur_sum >= s:
                mins.append(j - i + 1)

        return min(mins) if len(mins) != 0 else 0
