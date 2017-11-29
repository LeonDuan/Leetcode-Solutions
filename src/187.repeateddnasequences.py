class Solution(object):
    def findRepeatedDnaSequences(self, s):
        if len(s) <= 10:
            return []
        
        appeared = set()
        result = set()
        for i in range(0, len(s)-9):
            cur_seq = s[i:i+10]
            if cur_seq in appeared:
                result.add(cur_seq)
            else:
                appeared.add(cur_seq)
        
        return list(result)
        