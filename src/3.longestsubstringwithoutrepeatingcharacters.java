public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length() == 1) return 1;
        Map<Character, Integer> m = new HashMap<>();
        int count = 0;
        int max = 0;
        int countStart = 0;
        for(int i = 0; i < s.length(); i++) {
            int len;
            char c = s.charAt(i);
            if (!m.containsKey(c)) {
                m.put(c,i);
                count++;
                if(count>max) max = count;
            }
            else if(m.get(c) < countStart){//c in map is too far back
                len = i - countStart;
                if(len>max) max = len;
                count++;
                m.put(c,i);
            }
            else{
                len = Math.max(i - m.get(c),i-countStart);
                countStart = m.get(c)+1;
                if(len>max) max = len;
                count = i-m.get(c);
                m.put(c,i);
            }
        }
        if(count > max) max = count;
        return max;
    }
        
}