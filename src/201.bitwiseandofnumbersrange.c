int rangeBitwiseAnd(int m, int n) {
    long result = 0xFFFFFFFFFFFFFFFF;
    for(long i = m; i <= n; i++){
        result &= i;
        if(result == 0) break;
    }
    return result & 0xFFFFFFFF;
}