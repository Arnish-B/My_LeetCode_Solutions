class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long summ = 0;
        long counter = 0;
        for(int i:nums){
            if(i == 0){
                counter += 1;
            }
            else{
                summ += ((counter+1)*counter)/2;
                counter = 0;
            }
        }
        summ += ((counter+1)*counter)/2;
        return summ;
    }
}