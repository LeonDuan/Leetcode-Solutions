class Solution:
    def fourSumCount(self, A, B, C, D):
        """
        :type A: List[int]
        :type B: List[int]
        :type C: List[int]
        :type D: List[int]
        :rtype: int
        """
        res1, res2 = {}, {}
        result = 0
        for numA in A:
            for numB in B:
                numAB = numA + numB
                if numAB in res1:
                    res1[numAB] += 1
                else:
                    res1[numAB] = 1
        for numC in C:
            for numD in D:
                numCD = numC + numD
                if -numCD in res1:
                    result += res1[-numCD]

        return result