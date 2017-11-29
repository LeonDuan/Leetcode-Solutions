uint32_t reverseBits(uint32_t n) {
    int reversed = 0;
    int bit;
    for(int i = 0; i < 32; i++){
        bit = n & 1;
        reversed = (reversed << 1) + bit;
        n >>= 1;
    }
    return reversed;
}