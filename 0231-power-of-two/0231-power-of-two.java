class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean fin = false;
        int count = 0;
        while(n!=0){
            count += n & 1;
            n = n >> 1;
            if(count > 1){
                return false;
            }
        }
        if(count == 1){
            return true;
        }
        else{
            return false;
        }
    }
}