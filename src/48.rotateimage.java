public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length == 0 || matrix.length == 1) return;
        int temp;
        //transpose
        for(int i = 0; i &lt; matrix.length; i++){
            for(int j = 0; j &lt;= i; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //flip
        for(int i = 0; i &lt; matrix.length; i++){
            for(int j = 0; j &lt; matrix.length/2;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        return;
    }
}