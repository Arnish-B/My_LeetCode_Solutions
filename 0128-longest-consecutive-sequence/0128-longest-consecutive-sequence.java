class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen = 1;
        int curMax = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                curMax +=1;
                maxLen = Math.max(maxLen,curMax);
            }
            else if(nums[i] == nums[i-1]){
                
            }
            else{
                curMax = 1;
            }
        }
        return maxLen;
    }
}