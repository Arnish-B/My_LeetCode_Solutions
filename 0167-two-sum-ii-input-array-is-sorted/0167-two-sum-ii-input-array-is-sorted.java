class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fin[] = new int[2];
        int start = 0;
        int n = nums.length;
        int end = n-1;
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                fin[0] = start+1;
                fin[1] = end+1;
                break;
            }
            else if(sum > target){
                end -= 1;
            }
            else if(sum < target){
                start += 1;
            }
        }
        return fin;
    }
}