class Solution(object):
    def rec(self,idx, soFar, digits,result,dic):
        if idx == len(digits):
            result.append(soFar)
            return
        num = digits[idx]
        li = dic[num]
        for char in li:
            copy = soFar[:]
            copy += char
            self.rec(idx+1,copy,digits,result,dic)
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if digits == "":
            return []
        result = []
        dic = {"2":["a","b","c"],"3":["d","e","f"],"4":["g","h","i"],"5":["j","k","l"],"6":["m","n","o"],"7":["p","q","r","s"],"8":["t","u","v"],"9":["w","x","y","z"]}
        self.rec(0,"",digits, result,dic)
        return list(result)
        
