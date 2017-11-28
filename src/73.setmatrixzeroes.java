class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean lastRow = false;
        boolean firstCol = false;
        boolean lastCol = false;
        
        if(matrix.length == 0) return;
        if(matrix[0].length == 0) return;
        for(int i = 0; i &lt; matrix.length; i++){
            for(int j = 0; j &lt; matrix[0].length; j++){
                int num = matrix[i][j];
                if(num == 0){
                    if(i == 0){
                        firstRow = true;
                    }
                    if(j == 0){
                        firstCol = true;
                    }
                    if(i == matrix.length - 1){
                        lastRow = true;
                    }
                    if(j == matrix[0].length - 1){
                        lastCol = true;
                    }
                    if(!isCorner(i,j,matrix)){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for(int i = 1; i &lt; matrix.length - 1; i++){
            if(matrix[i][0] == 0) setRowToZero(matrix, i); 
        }
        for(int j = 1; j &lt; matrix[0].length - 1; j++){
            if(matrix[0][j] == 0) setColToZero(matrix, j);
        }
        if(firstRow){
            setRowToZero(matrix, 0);
        }
        if(lastRow){
            setRowToZero(matrix, matrix.length-1);
        }
        if(firstCol){
            setColToZero(matrix, 0);
        }
        if(lastCol){
            setColToZero(matrix, matrix[0].length-1);
        }
        
    }
    public void setRowToZero(int[][] matrix, int row){
        for(int i = 0; i &lt; matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }
    public void setColToZero(int[][] matrix, int col){
        for(int j = 0; j &lt; matrix.length; j++){
            matrix[j][col] = 0;
        }
    }
    public boolean isCorner(int i, int j, int[][] matrix){
        return ((i==0 &amp;&amp; j==0)||(i==0 &amp;&amp; j==matrix[0].length-1)||(i==matrix.length-1 &amp;&amp; j==0)||(i==matrix.length-1 &amp;&amp; j==matrix[0].length-1));
    }
}