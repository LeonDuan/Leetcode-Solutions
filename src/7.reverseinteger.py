class Solution(object):
  
  def reverse(self, x):
    neg = False
    result = 0
    if x &lt; 0:
      neg = True
      x = -x
    
    while x &gt; 0:
      digit = x % 10
      x = x - digit
      x = x / 10
      result = result * 10 + digit
      
    if neg:
      result = -result
    if result &gt; 2147483647 or result &lt; -2147483648:
        return 0
    return result