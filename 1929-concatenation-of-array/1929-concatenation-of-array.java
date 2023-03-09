class Solution {
    public int[] getConcatenation(int[] nums) {
        int fin[] = new int[nums.length * 2];
        for(int i=0;i<nums.length * 2;i++){
            if(i < nums.length){
                fin[i] = nums[i];
            }
            else{
                fin[i] = nums[i-nums.length];
            }
        }        
        return fin;
    }
}