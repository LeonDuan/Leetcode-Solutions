public class Solution {
    public int reverse(int x) {
        boolean pos = true;
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            pos = false;
            x = x * -1;
        }
        long newNum = 0;
        while(x > 0){
            int cur = x%10;
            newNum = newNum * 10 + cur;
            if(newNum > Integer.MAX_VALUE) return 0;
            x = x/10;
        }
        if(pos){
            return (int) newNum;
        }
        else{
            return -(int) newNum;
        }
    }
}