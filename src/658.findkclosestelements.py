class Solution:
    def findClosestElements(self, arr, k, x):
        """
        :type arr: List[int]
        :type k: int
        :type x: int
        :rtype: List[int]
        """
        import sys
        
        closest = abs(arr[0]-x)
        closest_idx = 0
        for i in range(len(arr)):
            num = arr[i]
            diff = abs(num - x)
            if diff < closest:
                closest_idx = i
                closest = diff
                 
        result = [arr[closest_idx]] 
        k -= 1
        left = closest_idx - 1
        right = closest_idx + 1
                
        while k > 0:
            k -= 1

            if left >= 0:
                left_num = arr[left]
            else:
                left_num = None

            if right < len(arr):
                right_num = arr[right]
            else:
                right_num = None
            
            if left_num is None:
                result = result + [arr[right]]
                right += 1
                continue
            if right_num is None:
                result = [arr[left]] + result
                left -= 1
                continue

            if abs(left_num-x) <= abs(right_num-x):
                result = [arr[left]] + result
                left -= 1
            else:
                result = result + [arr[right]]
                right += 1

        return result
            