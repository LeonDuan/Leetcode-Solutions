class Solution:
    def findMinDifference(self, timePoints):
        """
        :type timePoints: List[str]
        :rtype: int
        """
        for i in range(len(timePoints)):

            timePoints[i] = int(timePoints[i][:2]) * 60 + int(timePoints[i][3:])
            if timePoints[i] == 0: timePoints[i] = 24 * 60
            
        timePoints.sort()
        
        min_diff = (timePoints[1] - timePoints[0]) % (24*60)
        for i in range(len(timePoints)):
            if(i == len(timePoints) - 1):
                diff = (timePoints[0] - timePoints[i]) % (24*60)
            else:
                diff = (timePoints[i+1] - timePoints[i]) % (24*60)
                
            if diff &lt; min_diff: min_diff = diff
        return min_diff