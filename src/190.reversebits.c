uint32_t reverseBits(uint32_t n) {
    int reversed = 0;
    int bit;
    for(int i = 0; i &lt; 32; i++){
        bit = n &amp; 1;
        reversed = (reversed &lt;&lt; 1) + bit;
        n &gt;&gt;= 1;
    }
    return reversed;
}