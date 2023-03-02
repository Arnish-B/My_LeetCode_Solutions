class Solution {
    public int totalHammingDistance(int[] nums) {
        int fin = 0;
        
        for(int i=0;i<32;i++){
            int countOnes = 0;
            int countZeros = 0;
            for(int j =0;j<nums.length;j++){
                if(((nums[j] >> i) & 1) == 1){
                    countOnes += 1;
                }
                else{
                    countZeros += 1;
                }
            }
            fin += (countZeros * countOnes);
        }
        return fin;
    }
}