class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        result = ""
        if len(strs) == 0:
            return ""
        for i in range(len(strs[0])):
            char = strs[0][i]
            for str in strs:
                if i == len(str):
                    return result
                if str[i] != char:
                    return result
            result+=char
        return result