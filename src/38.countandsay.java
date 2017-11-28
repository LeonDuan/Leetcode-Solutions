class Solution {
    public String countAndSay(int n) {
        String cur_num_str = "1";

        for(int i = 0; i &lt; n-1; i++) {
            StringBuilder result = new StringBuilder();
            int count = 0;
            char prev = '0';
            for (char c : cur_num_str.toCharArray()) {
                if (prev != '0') {
                    if (c == prev) {
                        count++;
                    } else {
                        result.append(count);
                        result.append(prev);
                        count = 1;
                        prev = c;
                    }
                } else {
                    prev = c;
                    count++;

                }
            }
            if (count != 0) {
                result.append(count);
                result.append(prev);
            }
            cur_num_str = result.toString();
        }
        return cur_num_str;
    }
}