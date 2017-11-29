class Solution:
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        left = max(A, E)
        right = min(C, G)
        top = min(D, H)
        bottom = max(B, F)
        area1 = (C - A) * (D - B)
        area2 = (G - E) * (H - F)
        overlap = 0 if right - left < 0 or top - bottom < 0 else (right-left)*(top-bottom)
        return area1 + area2 - overlap