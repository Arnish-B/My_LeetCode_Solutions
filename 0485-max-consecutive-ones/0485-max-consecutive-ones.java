class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1){
            return (nums[0] == 1 ? 1 : 0);
        }
        int curMax = 0;
        int totalMax = 0;
        int flag = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                flag = 1;
                curMax += 1;
            }
            else{
                if(flag != 0){
                    totalMax = Math.max(curMax, totalMax);
                    curMax = 0;
                }
            }
        }
        totalMax = Math.max(curMax, totalMax);
        return totalMax;
        
    }
}