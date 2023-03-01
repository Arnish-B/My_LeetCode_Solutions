class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int setBits = 0;
        while(a!=0){
            setBits += a & 1;
            a >>= 1;
        }
        return setBits;
    }
}