class Solution():
    def getPermutation(self, n, k):
        self.k = k
        str_soFar = ""
        nums = [i for i in range(1, n + 1)]
        return self.rec(nums, 0, "")

    def rec(self, nums, perms_soFar, str_soFar):
        if len(nums) == 1:
            return str_soFar + ''.join(str(e) for e in nums)

        for i in range(len(nums)):
            will_have_discovered = math.factorial(len(nums) - 1)
            if perms_soFar + will_have_discovered &gt;= self.k:
                return self.rec(nums[:i] + nums[i + 1:], perms_soFar, str_soFar + str(nums[i]))
            else:
                perms_soFar += will_have_discovered
