int rangeBitwiseAnd(int m, int n) {
    long result = 0xFFFFFFFFFFFFFFFF;
    for(long i = m; i &lt;= n; i++){
        result &amp;= i;
        if(result == 0) break;
    }
    return result &amp; 0xFFFFFFFF;
}