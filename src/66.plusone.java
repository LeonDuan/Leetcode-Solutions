class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 1;
        for(int i = digits.length - 1; i &gt;= 0; i --){
            int cur_num = digits[i];
            int sum = cur_num + carry;
            if(sum &gt;= 10){
                carry = 1;
                digits[i] = sum % 10;
            }
            else{
                carry = 0;
                digits[i] = sum;
            }
        }
        if(carry == 0){
            return digits;
        }
        else{
            int[] plusOneResult = new int[digits.length + 1];
            plusOneResult[0] = 1;
            for(int i = 0; i &lt; digits.length; i++) {
                plusOneResult[i + 1] = digits[i];
            }
            return plusOneResult;
        }
    }
}