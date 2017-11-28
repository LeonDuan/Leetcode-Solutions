# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:    
    def merge(self, intervals):
        if len(intervals) == 0:
            return []
        intervals.sort(key=lambda x:x.start)
        cur_inter = None
        result = []
        interval = None
        for interval in intervals:
            if cur_inter is None:
                cur_inter = Interval(interval.start, interval.end)
            else:
                if cur_inter.end &gt;= interval.start:
                    cur_inter.end = interval.end if interval.end &gt; cur_inter.end else cur_inter.end
                else:
                    result.append(cur_inter)
                    print("Here")
                    cur_inter = Interval(interval.start, interval.end)
        result.append(cur_inter)
        return result
