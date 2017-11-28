class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        if(matrix[0].length == 0) return false;
        int lo = 0;
        int hi = matrix.length - 1;
//        int lo = matrix[0][0];
//        int hi = matrix[matrix.length-1][matrix[0].length-1];

        while(hi &gt;= lo){
            int mid = (hi + lo)/2;
            int[] row = matrix[mid];
            if(row[0] &lt;= target &amp;&amp; row[row.length-1] &gt;= target){
                lo = 0;
                hi = row.length - 1;
                while(hi &gt;= lo){
                    mid = (hi + lo)/2;
                    if(row[mid] == target) return true;
                    else if(row[mid] &gt; target) hi = mid - 1;
                    else lo = mid + 1;
                }
                return false;
            }
            else if(target &lt; row[0]){
                hi = mid - 1;
            }
            else if(target &gt; row[row.length-1]){
                lo = mid + 1;
            }
        }
        return false;
    }
}