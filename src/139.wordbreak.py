class Solution:
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        self.can = set()
        self.can.add("")
        self.cannot = set()
        self.wordDict = set(wordDict)
        return self.rec(0, s)

    def rec(self, idx, s):
        if s[idx:] is "": return True
        if idx in self.can: return True
        if idx in self.cannot: return False

        for i in range(idx + 1, len(s)+1):
            word = s[idx:i]
            if word in self.wordDict:
                if self.rec(i, s):
                    self.can.add(i)
                    return True

        self.cannot.add(idx)
        return False

s = Solution()
print(s.wordBreak("leetcode",["leet","code"]))